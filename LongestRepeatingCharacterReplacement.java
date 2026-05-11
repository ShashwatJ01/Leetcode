class Solution {
    public int characterReplacement(String s, int k) {
        // we keep track of the maxFrequency in the window and then we can check which one is not the maxFrequency

        int[] count = new int[26];
        int start = 0; int end = 0; int maxFrequency = 0;
        int maxLen = 1;

        while(end < s.length()) {
            char curr = s.charAt(end);
            count[curr - 'A']++;

            maxFrequency = Math.max(maxFrequency, count[curr - 'A']);

            while((end - start + 1) - maxFrequency > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}