class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int total=0;
        int temp2;
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                int temp = accounts[i][j];
                sum = sum+temp;
            }

            temp2 = Math.max(sum, total);
            total = temp2;
            sum=0;
        }
        return total;
    }
}