package LLD_HLD.HighLevelDesign.DesignRateLimiter1;

public abstract class RateLimiter {
    protected RateLimitConfig config;

    public RateLimiter(RateLimitConfig config){
        this.config = config;
    }

    public abstract boolean allowRequest(String userId);
}

// This is the base abstraction. All strategies implement this contract.
// This is essentially Strategy Pattern
