package LLD_HLD.HighLevelDesign.DesignRateLimiter1;

public class SlidingWindowLogLimiter extends RateLimiter{

    public SlidingWindowLogLimiter(RateLimitConfig config) {
        super(config);
    }
    
    @Override
    public boolean allowRequest(String userId) {
        return true;
    }
    
}
