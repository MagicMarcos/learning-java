package com.time;

/**
 * Business class to model the workings of an alarm clock.
 * This class dos NOT have a main() method - most class definitions do not.
 */
public class AlarmClock {
    // ======= CLASS-LEVEL (static) variables - there is only one copy, SHARED amongst instances =======
    // boundary values for snoozeInterval - NOT exposed (private fields, and NO get/set methods)
    // public == client can "touch" this value ----- static == shared ----- final == fixed (can't be changed)
    // public-static-final naming convention i.e., ALL_CAPS
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;
    private static int nextId = 1;

    // ======= PROPERTIES or ATTRIBUTES - we call these "instance variables" or "fields" =========
    // set AlarmClocks default snoozeInterval value to 5 minutes
    private int snoozeInterval = 5;
    private int repeat;

    // ======= CONTRUCTORS - special methods that get called when the client says "new" =========
    /*
     * Java requires at least on constructor per class - usually added by compiler if you write none
     * if you add one and you want a no arg ctor, then you must explicitly declare it
     */
    public AlarmClock(){
        // no operation method
    }

    // overloading lets us create different version of com.time.AlarmClock() that takes parameters
    public AlarmClock(int snoozeInterval){
        setSnoozeInterval(snoozeInterval); // delegate to setter for any validation/conversion
    }

    public AlarmClock(int snoozeInterval , int repeat){
        this(snoozeInterval); // delegates to ctor above instead of calling setter directly
        setRepeat(repeat);    // delegates to setter
    }

    // ======= BUSINESS or ACTION methods - these do "business work" =========
    void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes.");
    }

    // ======= ACCESSOR methods - provide "controlled" access to the internal (private) data =========
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // DONE: add code to enforce a business rule: incoming value must be in [1,20]
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval;
        } else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval + " minutes. " +
                    "Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " minutes.");
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    // ======= STRING method =======
    public String toString() {
        // generally better to call your own getters rather than direct field access
        return "com.time.AlarmClock: snoozeInterval = " + getSnoozeInterval() + ", repeat count: " + getRepeat() ;
    }
}