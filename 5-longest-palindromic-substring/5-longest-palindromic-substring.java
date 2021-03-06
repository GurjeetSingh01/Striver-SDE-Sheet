class Solution {
    public class Palindrome {
        public int start;
        public int end;
        public int length;
        public Palindrome(int start, int end) {
            this.start = start;
            this.end = end;
            this.length = end - start + 1;
        }
        public String toString(String s) {
            return s.substring(start, end + 1);
        }
    }
    private Palindrome getPalindrome(char[] arr, int start, int end) {
        while(start - 1 >= 0 && end + 1 < arr.length && arr[start - 1] == arr[end + 1]) {
            start--;
            end++;
        }
        return new Palindrome(start, end);
    }
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 1) return s;
        char[] arr = s.toCharArray();
        Palindrome max = new Palindrome(0, 0);
        for(int i = 0; i < arr.length; i++) {
            Palindrome even = getPalindrome(arr, i + 1, i); // first check will be i, i + 1
            Palindrome odd = getPalindrome(arr, i, i);
            if (even.length > max.length) {
                max = even;
            }
            if (odd.length > max.length) {
                max = odd;
            }
        }
        return max.toString(s);
    }    
}