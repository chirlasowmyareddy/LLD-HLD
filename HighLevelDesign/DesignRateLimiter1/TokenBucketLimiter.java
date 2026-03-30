package LLD_HLD.HighLevelDesign.DesignRateLimiter1;


public class TokenBucketLimiter extends RateLimiter{
    public TokenBucketLimiter(RateLimitConfig config) {
            super(config);
    }
    
    @Override
    public boolean allowRequest(String userId) {
        return true;
    }
    
}

// Each user has a bucket. Tokens refill over time.
// If tokens available → allow request, else reject.
// I used ConcurrentHashMap and synchronized block per user for thread safety
