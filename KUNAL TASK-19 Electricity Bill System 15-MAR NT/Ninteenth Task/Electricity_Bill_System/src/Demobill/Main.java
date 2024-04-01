package Demobill;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);

        Electricitybill b= new Electricitybill();
        
    	System.out.println(" ");
    	System.out.println("----------------First Enter your Details-------------");
    	System.out.println(" ");
    	
        boolean exit = false;
        while(!exit){
        	System.out.println("-----------------------------------------------------");
        	System.out.println(" ");
            System.out.println("Choose an option:");
            System.out.println("1. Enter basic details");
            System.out.println("2. Enter reading details");
            System.out.println("3. Generate electricity bill for a customer");
            System.out.println("4. Display Electricity Bill");
            System.out.println("5. Exit");
            System.out.println("-----------------------------------------------------");
            System.out.print("-->");
            
            int choice=si.nextInt();
            si.nextLine();

            switch(choice){
                case 1: 

                System.out.print("Enter Consumer's name:- ");
                String name = si.nextLine();
                System.out.print("Enter Consumer's address:- ");
                String address = si.nextLine();
                System.out.print("Enter Consumer's Mobilenumber:- ");
                Long mobilenumber = si.nextLong();
                b.adduser(new user(name, address,mobilenumber));
                System.out.println(" ");
                System.out.println("Customer added successfully.");
                System.out.println(" ");
                break;

                case 2:

                for(user c:b.getuser()){
                    System.out.print("Enter Billing Unit "+c.getName()+":- ");
                    int billingunit = si.nextInt();
                    System.out.print("Enter Consumer's number "+c.getName()+":- ");
                    long consumernumber = si.nextLong();
                    System.out.print("Enter Your Current Reading "+c.getName()+":- ");
                    double currentReading = si.nextDouble();
                    System.out.print("Enter Your Previous Reading "+c.getName()+":- ");
                    double previousReading = si.nextDouble();
                    b.ReadingDetails(c,billingunit,consumernumber,currentReading, previousReading);
                    System.out.println("Reading details has been successfully added move to next part...");
                }
                break;

                case 3:

                for(user c: b.getuser()){
                    System.out.print("Enter Consumer's Name:- ");
                    String user=si.nextLine();
                    String tocompareString=c.getName().toLowerCase();
                    if(tocompareString.contains(user.toLowerCase()))
                    {
                        b.userBill(c);
                        break;
                    }
                }
                break;

                case 4:

                System.out.println("Electricity bill is:- ");
                b.displayBill();
                break;

                case 5:

                exit=true;
                System.out.println("Thank You for using Billing system..");
                break;

                default:

                System.out.println("Invalid choice. Please try again.");
                break;
            }
        }
    }
}
