
public class ReverseInteger {
    public int reverse(int x) {
        long n = Math.abs(x);
        long ans=0;
        boolean f = x<0;
        
        while(n>0){
            long rem = n%10;
            ans = (ans*10) + rem;
            n /= 10;
        }
        if(ans <= Integer.MIN_VALUE || ans >= Integer.MAX_VALUE) return 0;
        return f ? (int) -ans : (int) ans;
    }
} 
