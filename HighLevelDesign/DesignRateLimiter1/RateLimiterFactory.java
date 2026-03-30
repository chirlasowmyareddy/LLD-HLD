package LLD_HLD.HighLevelDesign.DesignRateLimiter1;
public class RateLimiterFactory {
    public static RateLimiter createLimiter(RateLimiterType type, RateLimitConfig config) {
        switch (type) {
            case TOKEN_BUCKET:
                return new TokenBucketLimiter(config);
            case FIXED_WINDOW:
                return new FixedWindowLimiter(config);
            case SLIDING_WINDOW_LOG:
                return new SlidingWindowLogLimiter(config);
            case SLIDING_WINDOW_COUNTER:
                return new SlidingWindowCounterLimiter(config);
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}

// Factory centralizes object creation and avoids tight coupling.
