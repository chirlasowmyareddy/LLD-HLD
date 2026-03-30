package LLD_HLD.HighLevelDesign.DesignRateLimiter1;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterService {

    private Map<UserTier,RateLimiter> rateLimiters = new HashMap<>();
    
    public RateLimiterService(){
        RateLimitConfig freeConfig = new RateLimitConfig(5,10);
        RateLimitConfig premiumConfig = new RateLimitConfig(10, 10);

        rateLimiters.put(UserTier.FREE,RateLimiterFactory.createLimiter(RateLimiterType.FIXED_WINDOW, freeConfig));

        rateLimiters.put(UserTier.PREMIUM,RateLimiterFactory.createLimiter(RateLimiterType.FIXED_WINDOW, premiumConfig));
    }

    public boolean allowRequest(User user){
        return rateLimiters.get(user.tier).allowRequest(user.userId);
    }
    
}


// “Service maps tier to limiter.
// Free and premium users get different configs.”