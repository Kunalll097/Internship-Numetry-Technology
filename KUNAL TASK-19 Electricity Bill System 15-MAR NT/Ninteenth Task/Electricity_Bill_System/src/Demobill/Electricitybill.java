package Demobill;

import java.util.ArrayList;

public class Electricitybill {
    private ArrayList<user> userList;

    public Electricitybill()
    {
        userList=new ArrayList<>();
    }

    public void adduser(user c){
        userList.add(c);
    }

    public ArrayList<user> getuser(){
        return userList;
    } 

    public void ReadingDetails(user c,int billingunit, long consumernumber, double previousReading, double currentReading){
        c.setCurrentReading(currentReading);
        c.setPreviousReading(previousReading);
        c.setBillingunit(billingunit);
        c.setConsumernumber(consumernumber);
    }

    public void userBill(user c){
        final double BASE_CHARGE = 126.0;
        final double RATE_0_TO_100 = 4.41;
        final double RATE_101_TO_300 = 9.60;
        final double RATE_301_TO_500 = 13.61;
        final double RATE_501_TO_1000 = 15.57;
        final double RATE_ABOVE_1000 = 17.61;
        double unitsConsumed = c.getPreviousReading() - c.getCurrentReading();

        double totalBill;
        if (unitsConsumed <= 100) {
            totalBill = BASE_CHARGE + (unitsConsumed * RATE_0_TO_100);
        } else if (unitsConsumed <= 300) {
            totalBill = BASE_CHARGE + (100 * RATE_101_TO_300) + ((unitsConsumed - 100) * RATE_101_TO_300);
        } else if (unitsConsumed <= 500) {
            totalBill = BASE_CHARGE + (100 * RATE_301_TO_500) + ((unitsConsumed - 100) * RATE_301_TO_500);
        } else if (unitsConsumed <= 1000) {
            totalBill = BASE_CHARGE + (100 * RATE_501_TO_1000) + ((unitsConsumed - 100) * RATE_501_TO_1000);
        } else {
            totalBill = BASE_CHARGE + (100 * RATE_ABOVE_1000) + (100 * RATE_ABOVE_1000) + ((unitsConsumed - 1000) * RATE_ABOVE_1000);
        }
        
        System.out.println("Electricity bill for: " + c.getName());
        System.out.println("Address: " + c.getAddress());
        System.out.println("Billing unit: " + c.getBillingunit());
        System.out.println("Consumer's Number: " + c.getConsumernumber());
        System.out.println("Units Consumed: " +unitsConsumed);
        System.out.println("Total Bill: Rs.: " +totalBill);

    }

    public void displayBill(){
        for(user c: userList){
            userBill(c);
            System.out.println();
        }
    }
}
