package com.time;

/*
 * Test-class to verify that our validation code works correctly.
 * We will use Boundary Value testing.
 * For range of valid inputs [1,20], we test each boundary:
 *  both valid and invalid values
 *  0,1 / 20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        // test the lower boundary
        clock.setSnoozeInterval(1);     // should "stick" - i,e., the value should be 1
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);     // error message - value should still be 1 (assigned above)
        System.out.println("snoozeInterval: "  + clock.getSnoozeInterval()); // should still be 1

        // the upper boundary
        clock.setSnoozeInterval(20);    // should "stick"
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);    // error message
        System.out.println("snooozeInterval: " + clock.getSnoozeInterval()); // should still be 20
    }
}