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

    // INSTANCE VARIABLES
    // setting default variables should be saved for when they are true for most instances most of the time
    private String brand;
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

    public void setBrand(String brand) {
        if (brand == "Samsung" || brand == "LG" || brand == "Toshiba") {
            this.brand = brand;
        } else {
            System.out.println("Brand " + brand + " is invalid! Only brands: Samsung, LG or Toshiba are accepted");
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
            System.out.println("Volume " + volume + " is invalid." +
                    "Please provide a value between " + MIN_VOLUME + " and " + MAX_VOLUME + ".");
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

    // toString() method

    public String toString() {
        return "Television: " +
                "brand: " + getBrand() + " , " +
                "displayType: " + getDisplayType() + " , " +
                "volume: " + getVolume() + ", " +
                "isMuted: " + getIsMuted() + ". " +
                "This is instance number: " + instanceCount + ".";
    }
}