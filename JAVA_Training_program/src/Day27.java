class Solution {
    public int countDigits(int num) {
        int origin = num;
        int count = 0;
        while(num>0){
            if(origin%(num%10)==0)  count++;
            num/=10;
        }
        return count;
    }

    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0){
            int x = n%10;
            sum+=x;
            product*=x;
            n/=10;
        }
        return product-sum;
    }
}