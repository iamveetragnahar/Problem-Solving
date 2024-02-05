class Solution {
public:
    int hammingWeight(uint32_t n) {
        int total_num=0;
        while(n!=0){
        if(n&1==1){
         ++total_num; }
         n=n>>1;
        }
        return total_num;
    }
};