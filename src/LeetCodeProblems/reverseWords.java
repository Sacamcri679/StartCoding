package LeetCodeProblems;

class Solution {
    public String reverseWord(String s) {
        s = s.trim();

        String[] words = s.split("\\s+");
        int left = 0;
        int right = words.length -1;

        while(left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }
        return String.join(" ", words);
    }
    public static  void main(String[] args) {
        Solution sol = new Solution();
        String result = sol.reverseWord(" hello world ");
        System.out.println(result);
    }
}

