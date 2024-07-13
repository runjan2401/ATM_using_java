import java.util.*;

class atmMachine{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int deposite;
        int withdraw;

        while(true){
            System.out.println("Chose 1 for deposite:");
            System.out.println("Chose 2 for Withdraw:");
            System.out.println("Chose 3 for Check Balance:");
            System.out.println("Chose 4 for Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter ammount you want to deposite:");
                    deposite = sc.nextInt();
                    balance = balance + deposite ;
                    System.out.println("Your updated balance is::" +balance);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter ammount you want to Withdraw:");
                    withdraw = sc.nextInt();
                    if(balance >= withdraw){
                        balance = balance - withdraw;
                        System.out.println("Your Updated balance is::"+balance);
                    }    
                    else{
                        System.out.println("Insufficient Balance:");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Your Balance is:"+balance);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0); 
                    break;

                default:				
                break;         
            }
        }
    }
}