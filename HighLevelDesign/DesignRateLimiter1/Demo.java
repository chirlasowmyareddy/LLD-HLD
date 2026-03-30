package LLD_HLD.HighLevelDesign.DesignRateLimiter1;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        RateLimiterService service = new RateLimiterService();

        User freeUser = new User("user1", UserTier.FREE);
        User premiumUser = new User("user2", UserTier.PREMIUM);

        System.out.println("---- FREE USER ----");
        for (int i = 1; i <= 7; i++) {
            boolean allowed = service.allowRequest(freeUser);
            System.out.println("Request " + i + ": " + allowed);
        }

        System.out.println("\n---- WAITING FOR WINDOW RESET ----");
        Thread.sleep(10000); // wait for window reset (10 sec)

        for (int i = 1; i <= 3; i++) {
            boolean allowed = service.allowRequest(freeUser);
            System.out.println("Request after reset " + i + ": " + allowed);
        }

        System.out.println("\n---- PREMIUM USER ----");
        for (int i = 1; i <= 12; i++) {
            boolean allowed = service.allowRequest(premiumUser);
            System.out.println("Request " + i + ": " + allowed);
        }
    }
}
