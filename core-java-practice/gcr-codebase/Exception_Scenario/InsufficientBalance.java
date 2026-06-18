
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class ATM {
    double balance = 5000;
    public void withdraw(int amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance found!");
        }

        balance -= amount;
        System.out.print("Withdrawal successful. Remaining balance = "+balance );
    }
}

public class InsufficientBalance{
    public static void main(String[] args){
        ATM atm = new ATM();

        try{
            atm.withdraw(8000);
        }catch(InsufficientBalanceException e){
            System.out.print(e.getMessage());
        }
    }
}
