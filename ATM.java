import java.util.Scanner;
public class ATM {
    
    private int pin;
    private double balance;
    private int accountno;
    public static int acc_counter=10000; 


    ATM(int pin, double balance){
        
        acc_counter++;
        accountno=acc_counter;
        this.pin=pin;
        this.balance=balance;
    }
    
    public int get_accountno(){

        return acc_counter;
    }
    
    public void showBalance(){

       System.out.println("Balance= "+balance);


    }

    public void deposit(double amount){

        balance=balance+amount;

        System.out.println(amount+" amount deposited");

    }

    public void withdraw(double amount,int pin){

        if(this.pin==pin){

            if(balance>amount && amount>0){
            balance=balance-amount;
            System.out.println(amount+" amount withdrawn");
            }

            else{
                throw new IllegalArgumentException("Insufficient Balance or Amount is less than 1");
            }

            
        }
        
        else{
            throw new SecurityException("Incorrect PIN");
        }
        

    }




    public static void main(String[] args){
        
        
  
       Scanner sc=new Scanner(System.in);
       System.out.print("Set PIN Number: ");
       int pin=sc.nextInt();
       System.out.print("Set initial Balance: ");
       int balance=sc.nextInt();
       ATM at1=new ATM(pin,balance);
       
       while (true) {

      

        System.out.println("ATM Simulator");
        System.out.println("1.Check Balance");
        System.out.println("2.Get Accountno");
        System.out.println("3.Withdraw");
        System.out.println("4.Deposit");
        System.out.println("5.Exit");
        System.out.println("Enter your Choice(1,2,3,4,5): ");
        int choice=sc.nextInt();

        switch(choice){

            case 1:
            at1.showBalance();
            break;

            case 2:
            System.out.println(at1.get_accountno());
            break;

            case 3:

            System.out.println("Enter amount to withdraw");
            int amount=sc.nextInt();
            System.out.println("Enter the PIN");
            int PIN=sc.nextInt();
            try{
            at1.withdraw(amount,PIN);
            }
            catch(SecurityException se){

                System.out.println("Incorrect Pin");

            }
            catch(IllegalArgumentException ie){

                System.out.println("Insufficient Balance or Amount is less than 1");
            }
            break;

            case 4:
            System.out.println("Enter amount to deposit: ");
            amount=sc.nextInt();
            at1.deposit(amount);
            break;

            case 5:
            return;
            
            default:
            System.out.println("Invalid Input");
            break;
          
        }

        
       }
       
        



    }
}
