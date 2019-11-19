/*
指数运算

a的n次方
 */

package dc;

public class ExponentCalculation {
    public static long calculation(int a, int n) {
        if (n == 0 || a == 1) {
            return 1;
        }

        if (n < 0) {
            return 1 / calculation(a, n * -1);
        }
        if (n % 2 == 0) {
            long val = calculation(a, n / 2);
            return val * val;
        } else {
            long val = calculation(a, n / 2);
            return val * val * a;
        }
    }
}
