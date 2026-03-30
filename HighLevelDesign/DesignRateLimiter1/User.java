package LLD_HLD.HighLevelDesign.DesignRateLimiter1;

public class User {
    String userId;
    UserTier tier;

    public User(String id,UserTier tier){
        this.userId = id;
        this.tier = tier;
    }
    
}
// User has userId and tier. Tier helps decide rate limiting policy
