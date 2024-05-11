package constants;

public class Constant {
    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 8;

    }
    public static class Config {
        public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;
        public static final Boolean HOLD_BROWSER_OPEN = true;
    }
    public static class Urls{
        public static final String GOOGLE_CLOUD = ("https://cloud.google.com/");
        public static final String GOOGLE_CLOUD_PRICING_CALCULATOR = ("https://cloud.google.com/products/calculator-legacy");
    }
    public static class InstancesVariable {
        public static final String NUMBER_OF_INSTANCES = "4";
        public static final String DATACENTER_LOCATION = "Frankfurt";
    }
}
