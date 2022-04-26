package homework_042622;

public class bankAccount {
    Double balance;
    String accountHolder;
    Long accountNumber;
    public void setBankAccount(String accountHolder,long accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void totalBalance(){
        System.out.println("Total balance = " + balance);;
    }
    public double withDraw(double amount){
        balance-=amount;
        return balance;
    }
    public double deposit(double amount){
        balance+=amount;
        return balance;
    }

}
