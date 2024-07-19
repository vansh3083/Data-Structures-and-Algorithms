class Solution {
    public int reverse(int x) {
        int num=x;
        int temp=0;
        int rev=0;
        while(num!=0){
            temp = num % 10;
            num/=10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && temp > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && temp < -8))
                return 0;


            rev=rev*10 + temp;
        }
        return rev;
    }
}