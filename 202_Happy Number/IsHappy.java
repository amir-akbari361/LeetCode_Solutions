import java.util.HashSet;
import java.util.Set;

class IsHappy {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n))
        {
            set.add(n);
            n=next(n);
        }
        return n==1;
    }

    public static int next(int num) {
        int sum = 0;
        while (num >= 1) {
            int temp = num % 10;
            sum += temp * temp;
            num = num / 10;
        }
        return sum;
    }
}