package sit707_week6;

public class LoopUtils {
    /**
     * Simple loop function with instructions in the loop body.
     */
    public static int simpleLoop(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    /**
     * Loop function with a conditional statement in the loop body.
     */
    public static int conditionalLoop(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                value *= i;
            }
        }
        return value;
    }
}