package homework_042622;

public class bankAccountObject {
    public static void main(String[] args) {
        bankAccount customer=new bankAccount();
        customer.setBankAccount("Ege Gunege",123456,1000.00);
        System.out.println("New Withdraw: " + customer.withDraw(50));
        System.out.println("New Deposit: " + customer.deposit(100));
        customer.totalBalance();
    }

}
