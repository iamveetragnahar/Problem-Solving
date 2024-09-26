class Solution {
    public boolean isMatch(String s, String p) {
        if(s == null || p == null) {
            return false;
        }
        
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        dp[0][0] = true;
        
        // no need to initialize state[i][0] as false
        // initialize state[0][j]
        for(int j = 1; j < m+1; j++){
            if(p.charAt(j-1) == '*'){
                if (dp[0][j - 1] || (j > 1 && dp[0][j - 2])) {
                    dp[0][j] = true;
                }
            }
        }

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.'){
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    //sure replacing by empty sequence needed case.
                    if (s.charAt(i - 1) != p.charAt(j - 2) && p.charAt(j - 2) != '.') {
                        dp[i][j] = dp[i][j - 2];
                    //not sure if replacing needed or not case.
                    } else {
                        dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i][j - 2];
                    }
                }
            }
        }
        return dp[n][m];
    }
}