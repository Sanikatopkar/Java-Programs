class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
class BankAccount {
    double balance=100;
    BankAccount(double balance){
        this.balance=balance;
    }
    void balanceEnquiry(){
        System.out.println("Current balance: "+balance);
    }
    void deposite(double amount)throws NegativeNumberException{
        if(amount<0){
            throw new NegativeNumberException("Amount cannot be negative!");
        }
        balance+=amount;
        System.out.println("Amount deposited: "+amount);

    }
    void withdraw(double amount)throws LowBalanceException,NegativeNumberException{
        if(amount<0){
            throw new NegativeNumberException("Amount cannot be negative!");
        }
        if(amount>balance){
            throw new LowBalanceException("Insufficient balance!");
        }
        balance-=amount;
        System.out.println("Amount withdrawn: "+amount);
    }
}
public class Main6{
    public static void main(String[] args) {
        BankAccount account=new BankAccount(1000);
        account.balanceEnquiry();
        try{
            account.deposite(50);
            account.withdraw(30);
            account.withdraw(150);
        }catch(LowBalanceException | NegativeNumberException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}