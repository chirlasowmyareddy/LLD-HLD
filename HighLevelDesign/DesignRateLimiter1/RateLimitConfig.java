package LLD_HLD.HighLevelDesign.DesignRateLimiter1;

public class RateLimitConfig {

    int maxRequest;
    int windowInSeconds;

    public RateLimitConfig(int req,int win){
        this.maxRequest= req;
        this.windowInSeconds = win;
    }
    
}

// Config makes the system flexible so we can change limits without changing logic
