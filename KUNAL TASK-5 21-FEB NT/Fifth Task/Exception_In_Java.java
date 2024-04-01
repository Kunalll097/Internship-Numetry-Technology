// import java.util.Scanner;

public class Exception_In_Java {

    public static void main(String[] args){

        // Scanner si=new Scanner(System.in);

        // int no1=10;
        // int no2=2;

        // try{
        //     String name="10";
        //     int i =Integer.parseInt(name);

        //     int Res = no1/no2;
        //     System.out.println("Division is: "+Res);
        // }
        // catch (ArithmeticException e){
        //     System.out.println(e);
        // }
        // catch (NumberFormatException e){
        //     System.out.println(e);
        // }
        // finally {
        //     System.out.println("Thank you...");
        // }

        try{
                       String name ="Numetry";
                       int i =Integer.parseInt(name);
                       i++;
                       System.out.println(i);
                   }
                   catch (Exception e){
                       System.out.println(e);
                   }
                   finally {
                       {
                           System.out.println("Thank you....");
                       }
                   }

                //    try{
                //                int[] Arr=new int[3];
                //                Arr[2]=100;
                //                System.out.println("Data is :"+Arr[2]);
                //            }
                //            catch (Exception e){
                //                System.out.println(e);
                //            }
                //            finally{
                //                System.out.println("Thank you.....");
                //            }
    }
}