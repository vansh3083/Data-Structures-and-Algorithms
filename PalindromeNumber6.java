class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int temp=0;
        int rev=0;
        int copy=num;
        boolean value;

        while(num>0) {
            temp = num%10;
            rev = rev*10 + temp;
            num /= 10;
        }
        if (rev == copy){
            value = true;
        }
        else{
            value=false;
        }
        return value;
    }
}