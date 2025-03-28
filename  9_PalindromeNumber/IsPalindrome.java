public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String z = String.valueOf(x);
        int a = 0;
        int b = z.length()-1;
        while (b > a) {
            if (z.charAt(a) != z.charAt(b)) {
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
