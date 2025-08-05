import java.util.Scanner;
public class BankAccount {

    String name;
    double balance;
    int accountno;
    double ammount;
    

    public BankAccount(String name,int accountno,double balance){

        this.name=name;
        this.accountno=accountno;
        this.balance=balance;
    }

   public void withdraw(double ammount){

    if(balance<ammount){
        System.out.println("Insufficient Funds \n");
    }
    else{
        balance=balance-ammount;
    System.out.println(ammount+" ammount withdrawn \n");
    }

    } 

    public void deposit(double ammount){

        balance=balance+ammount;
        System.out.println(ammount+" ammount added to the account \n");

    }

    public void showBalance(){

        System.out.println("Balance = "+balance+"\n");

    }

    public void displayAccount(){
        System.out.println("Account Holder: "+name);
        System.out.println("Account No: "+accountno);
        System.out.println("Balance: "+balance+"\n");

    }

     public static void main(String[] args) {
           
        Scanner sc=new Scanner(System.in);

            
        BankAccount bank1= new BankAccount("Parth",2084,50000);
        /*
            bank1.displayAccount();
            bank1.deposit(6000);
            bank1.showBalance();
            bank1.withdraw(3000);
            bank1.showBalance();
 */
            SavingAccount s1 = new SavingAccount("Parth", 2084, 50000, 10);
           // s1.with_Interest();


            while(true){
                System.out.println("Welcome to Bank Portal");
                System.out.println("1.Display Account Details");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Show Balance");
                System.out.println("5.Show Savings Account Balance");
                System.out.println("6.Exit");

                System.out.println("Enter your choice (1,2,3,4,5,6): ");
                int choice=sc.nextInt();

                switch(choice){
                    case 1:
                    s1.displayAccount();
                    break;
                    case 2:
                    System.out.println("Enter Ammount to deposit: ");
                    int amount=sc.nextInt();
                    s1.deposit(amount);
                    break;
                    case 3:
                    System.out.println("Enter Ammount to withdraw: ");
                    amount=sc.nextInt();
                    s1.withdraw(amount);
                    break;
                    case 4:
                    s1.showBalance();
                    break;
                    case 5:
                    s1.with_Interest();
                    break;
                    case 6:
                    System.out.println("Thank You");
                    return;
                    default:
                    System.out.println("Invalid Choice");
                    break;

                    
                }


            }


        }



    static class SavingAccount extends BankAccount{

        private int rate;

        public SavingAccount(String name, int accountno, double balance,int rate) {
            super(name, accountno, balance);
           this.rate=rate; 
        }

        

        
        public void with_Interest(){

            double interest;
            interest=(balance*rate)/100;
            deposit(interest);
            System.out.println("Balance in Savings account= "+balance+"\n");

        }

       


    }

}