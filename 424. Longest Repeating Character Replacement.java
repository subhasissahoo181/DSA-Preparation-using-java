class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] char_count = new int[26];

        int windows_start =0;
        int max_length = 0;
        int max_count =0;

        for(int windows_end =0; windows_end<n; windows_end++){
            char_count[s.charAt(windows_end)-'A']++;
            int current_char_count = char_count[s.charAt(windows_end)-'A'];
            max_count = Math.max(max_count,current_char_count);

            while(windows_end - windows_start - max_count +1 >k){
                char_count[s.charAt(windows_start)-'A']--;
                windows_start ++;
            }
            max_length = Math.max(max_length,windows_end - windows_start+1);
        }
        return max_length;
        
    }
}