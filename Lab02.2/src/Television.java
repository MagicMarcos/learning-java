import java.util.Arrays;

/**
 * Business class to model the workings of a television set
 */
class Television {
    // STATIC FIELDS and METHODS
    public static final int MIN_VOLUME = 0; // boundary values for volume [1,100]
    public static final int MAX_VOLUME = 100;
    private static int instanceCount;

    public static int getInstanceCount() { // client read-only access
        return instanceCount;
    }

    private static boolean isValidBrand(String brand) { // validates the brand
        boolean isValid = false; // MUST set to "false", local vars do not get default values

        for (String validBrand : VALID_BRANDS) {
            if(brand.equals(validBrand)){
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    // INSTANCE VARIABLES
    // setting default variables should be saved for when they are true for most instances most of the time
    private String brand;
    public static final String[] VALID_BRANDS = {"Samsung" , "LG" , "Sony" , "Toshiba"};
    private int volume;
    private DisplayType display = DisplayType.LED; // default

    private boolean isMuted;
    private int oldVolume;

    // CONSTRUCTORS -- special methods that get called when client says "new"
    public Television() {
        instanceCount ++;
    }

    public Television(String brand) {
        this(); // delegate to no arg constructor
        setBrand(brand); // delegate to setter for validation

    }

    public Television(String brand, int volume) {
        this(brand); // delegate to constructor above
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display){
        this(brand, volume);
        setDisplayType(display);
    }

    // BUSINESS methods
    public void turnOn() {
        // check connection
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + getBrand() + " Television. Volume is set to " + getVolume());
    }

    public void turnOff() {
        System.out.println("Turning off your " + getBrand() + " Television");
    }

    public void mute(){
        if(!getIsMuted()){
            oldVolume = volume;
            volume = 0;
            isMuted = true;
        } else {
            volume = oldVolume;
            isMuted = false;
        }
    }

    // ACCESSOR METHODS - controlled access to the object instance variables

    public String getBrand() {
        return brand;
    }

    // VALID_BRANDS = ["Samsung", "Sony", "LG", "Toshiba"]
    public void setBrand(String brand) {
        if(isValidBrand(brand)) {
            this.brand = brand;
        } else {
            System.out.println("Brand " + brand + " is invalid! " +
                    "Only brands: " + Arrays.toString(VALID_BRANDS));
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.isMuted = false;
            this.volume = volume;
        } else {
            System.out.printf("Invalid volume: %s. Valid range is [%s-%s].\n",
                    volume, MIN_VOLUME, MAX_VOLUME);
//            System.out.println("Invalid " + volume + "." +
//                    "Valid range is [" + MIN_VOLUME + " - " + MAX_VOLUME + "].");
        }
    }

    public DisplayType getDisplayType(){
        return display;
    }

    public void setDisplayType(DisplayType display){
        this.display = display;
    }

    public boolean getIsMuted(){
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    public String[] getBrands(){
        return VALID_BRANDS;
    }

    // toString() method

    public String toString() {
        // String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand = %s, volume = %s, display = %s, " +
                "isMuted = %s. This instance #%s.",
                getBrand(), getVolume(), getDisplayType(), getIsMuted(), instanceCount);

//        return "Television: " +
//                "brand: " + getBrand() + " , " +
//                "displayType: " + getDisplayType() + " , " +
//                "volume: " + getVolume() + ", " +
//                "isMuted: " + getIsMuted() + ". " +
//                "This is instance number: " + instanceCount + ".";
    }
}