public class Problem6 {
    public static int calculateInterest(double amount, double rate, int years){
        if(amount <= 0 || rate <= 0 || years <= 0){
            throw new IllegalArgumentException("Amount, rate, and years can't be negative.");
        }
        return (int)(amount * rate * years / 100);
    }

    public static void main(String[] args){
        try{
            calculateInterest(-1000,5,2);

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
