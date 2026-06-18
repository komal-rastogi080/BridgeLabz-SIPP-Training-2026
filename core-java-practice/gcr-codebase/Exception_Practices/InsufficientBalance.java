
public class InsufficientBalance extends Exception {

    try{
        withdraw(8000);
    }catch(InsufficientBalance e){
        System.out.print("InsufficientBalanceException caught : "+ e.getMessage());
    }

    public static void withdraw(int amount){
        int balance = 8000;
        if(amount < balance){
            throw new InsufficientBalance("Insufficient Balance in ATM")
        }
        System.out.print(amount);
    }
}
