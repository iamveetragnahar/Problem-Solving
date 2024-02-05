class Solution {
public:
    int subtractProductAndSum(int n) {
        int rem,add=0,product=1;
        while(n!=0){
        rem=n%10;
        add+=rem;
        product*=rem;
        n/=10;
        }
        return product-add;
    }
};