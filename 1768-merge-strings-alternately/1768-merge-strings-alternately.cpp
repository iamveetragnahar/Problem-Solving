class Solution {
public:
    string mergeAlternately(string word1, string word2) {
        string s="";
        int i=0;
        int j=0;
        int k=0;
        bool first=true;
        while(i<word1.length() && j<word2.length()){
            if(first){
                s+=word1[i++];
                first=!first;
            }
            else{
                s+=word2[j++];
                first=!first;
            }
            k++;
        }
        while(i<word1.length()){
            s+=word1[i++];
        }
        while(j<word2.length()){
            s+=word2[j++];
        }
        return s;
    }
};