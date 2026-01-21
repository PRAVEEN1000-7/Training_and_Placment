import java.util.Scanner;

public class BankAccount {
    
    private final int accno;
    private double balance=0;

    BankAccount(int accno, double balance) {
        this.accno = accno;
        if (balance >0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    int getAccno(){
        return this.accno;
    }

    double getBalance(){
        return this.balance;
    }
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the accno : ");
            int accno = sc.nextInt();

            System.out.print("Enter the balance : ");
            float balance = sc.nextFloat();
            
            BankAccount ba = new BankAccount(accno, balance);

            System.out.println("Name : "+ba.getAccno()+"\nSalary : "+ba.getBalance());
        }
        
        
    }
    
}
