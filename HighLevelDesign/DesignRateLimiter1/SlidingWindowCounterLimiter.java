package LLD_HLD.HighLevelDesign.DesignRateLimiter1;

public class SlidingWindowCounterLimiter extends RateLimiter{

    public SlidingWindowCounterLimiter(RateLimitConfig config) {
        super(config);
    }

    @Override
    public boolean allowRequest(String userId) {
        return true;
    }
    
}
