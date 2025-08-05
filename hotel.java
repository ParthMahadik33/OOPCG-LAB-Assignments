import java.util.Scanner;
public class hotel{
    
    
    static int floor=4;
    static int rooms=5;
    static char[][] hotel= new char[floor][rooms];

    static void initialize(){
        for(int i=0;i<floor;i++){
        for(int j=0;j<rooms;j++){
            hotel[i][j]='a';
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        initialize();
     while(true){
        System.out.println("1.View Rooms");
        System.out.println("2.Book Rooms");
        System.out.println("3.Exit");
        System.out.print("Enter Your Choice: ");

        int choice=sc.nextInt();

        switch(choice){
            case 1:
            viewrooms();
            break;
            case 2:
            bookrroms();
            break;
            case 3:
            System.out.println("THANK YOU");
            return;
            default:
            System.out.println("Invalid Choice");
            break;
        }
     }
      
        
    }
    public static void viewrooms(){

        for(int i=0;i<floor;i++)
        {
            System.out.print("Floor "+(i+1)+": ");
            for(int j=0;j<rooms;j++){
                System.out.print((j+1)+":"+hotel[i][j]+ " ");
                
            }
            System.out.println();

        }
    }

    static void bookrroms(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Floor (1-4): ");
        int Floor=sc.nextInt();
        System.out.println("Enter Room  (1-5): ");
        int Room=sc.nextInt();
        if (hotel[Floor-1][Room-1]=='b'){
            System.out.println("Room is Already Booked");
        }
        else{
            hotel[Floor-1][Room-1]='b';
            System.out.println("Room booked successfully");
        }
        


    }


}