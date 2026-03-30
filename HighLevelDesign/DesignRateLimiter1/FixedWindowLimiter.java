package LLD_HLD.HighLevelDesign.DesignRateLimiter1;

import java.util.concurrent.ConcurrentHashMap;

public class FixedWindowLimiter extends RateLimiter{

    private class Window {
        int count;
        long startTime;
    }
    private ConcurrentHashMap<String,Window> mpp = new ConcurrentHashMap<>();
    public FixedWindowLimiter(RateLimitConfig config) {
        super(config);
    }
    
    @Override
    public boolean allowRequest(String userId) {
       long now  = System.currentTimeMillis();

       //get or create  window for user
       Window window = mpp.computeIfAbsent(userId, k ->{
            Window w = new Window();
            w.startTime = now;
            return w;
       });

       synchronized (window) { // thread-safe per user

        // if window expired → reset
        if (now - window.startTime >= config.windowInSeconds * 1000) {
            window.count = 0;
            window.startTime = now;
        }

        // check limit
        if (window.count < config.maxRequest) {
            window.count++;
            return true;
        }

        return false;
    }
    }
}
