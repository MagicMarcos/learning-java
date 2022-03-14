package com.time;

/**
 * Client-side "main class" to get the system going.
 * The "main class" is simply the class definition with main() in it.
 */
class AlarmClockClient {

    // ENTRY-point or starting point of the application.
    public static void main(String [] args) {
        // create an instance of com.time.AlarmClock and set it's snoozeInterval property
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(AlarmClock.MAX_INTERVAL); // snooze for as long as possible given constraints
        clock1.setRepeat(5); // snooze n times before giving up (overslept)

        // caLL it's snooze() method
        clock1.snooze();

        // create a second instance of com.time.AlarmClock and set it's snoozeIntercal
        // we can pass in the interval directly to com.time.AlarmClock() to call the overloaded method
        AlarmClock clock2 = new AlarmClock(54 ,5);


        // call clock2 snooze() method
        clock2.snooze();

        // create a third instance of com.time.AlarmClock, but don't set its snoozeInterval
        AlarmClock clock3 = new AlarmClock();

        // call clock3 snooze() method
        clock3.snooze();

        System.out.println();

        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3); // toString() is automatically called
    }
}