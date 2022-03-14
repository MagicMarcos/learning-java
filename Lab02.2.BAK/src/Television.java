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

    // BUSINESS methods
    public void turnOn() {
        // check connection
        boolean isConnected = verifyInternetConnection();

        System.out.println("Turning on your " + getBrand() + " Television. Volume is set to " + getVolume());
    }

    public void turnOff() {
        System.out.println("Turning off your " + getBrand() + " Television");
    }

    // ACCESSOR METHODS - controlled access to the object instance variables

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    // toString() method

    public String toString() {
        return "Television: " +
                "brand = " + getBrand() +
                ", volume = " + getVolume() + "." +
                " This is instance: " + instanceCount + ".";
    }
}