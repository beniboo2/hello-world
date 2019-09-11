import java.math.BigInteger;

public class HW2 {
    public static int fibonacci(int index) {
        if (index == 0) return 0;
        else if (index == 1) return 1;
        else
            return fibonacci(index - 1) + fibonacci(index - 2);
    }
}