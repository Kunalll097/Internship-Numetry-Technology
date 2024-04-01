import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class File_Handling {

    public static void main(String[] args)throws IOException{

       @SuppressWarnings("resource")
    Scanner si = new Scanner(System.in);

       FileWriter fw = null;
       try{
           fw = new FileWriter("Dialog.txt",true);//we can save these text files in c drive or d drive and also we can give link of file or we can enter as (----->  d:/Dialog.txt   <-----). 
            System.out.println("Enter Data : \n");
           String msg = si.nextLine();
           fw.write(msg);
       }
       catch (Exception e){
           System.out.println(e);
       }
       finally{
           fw.close();
           System.out.println(" ");
           System.out.println("Thank you...");
       }

        FileReader fr = null;
        try{
            fr = new FileReader("Dialog.txt");
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            fr.close();
            System.out.println(" ");
            System.out.println("Thank you...");
        }
    }
}
