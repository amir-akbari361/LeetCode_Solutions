import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int counter = 1;
                while (set.contains(current + 1)) {
                    counter++;
                    current++;
                }
                max = Math.max(max, counter);
            }
        }
        return max;
    }
}
