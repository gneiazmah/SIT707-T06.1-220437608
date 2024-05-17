package sit707_week6;

public class ConditionalLoopUtils {
    // Function with a conditional loop (for loop) with simple instructions in the loop body
    public static int simpleLoop(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    // Function with a conditional loop (for loop) containing a conditional statement in the loop body
    public static int conditionalLoop(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
