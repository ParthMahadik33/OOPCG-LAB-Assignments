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
        System.out.println("Insufficient Funds");
    }
    else{
        balance=balance-ammount;
    System.out.println(ammount+" ammount withdrawn");
    }

    } 

    public void deposit(double ammount){

        balance=balance+ammount;
        System.out.println(ammount+" ammount added to the account");

    }

    public void showBalance(){

        System.out.println("Balance = "+balance);

    }

    public void displayAccount(){
        System.out.println("Account Holder: "+name);
        System.out.println("Account No: "+accountno);
        System.out.println("Balance: "+balance);

    }

     public static void main(String[] args) {
            
            BankAccount bank1= new BankAccount("Parth",2084,50000);
            bank1.displayAccount();
            bank1.deposit(6000);
            bank1.showBalance();
            bank1.withdraw(3000);
            bank1.showBalance();

            SavingAccount s1 = new SavingAccount("Parth", 2084, 50000, 10);
            s1.with_Interest();


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
            System.out.println("Balance in Savings account= "+balance);

        }

       


    }

}