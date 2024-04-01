// package Fifth Task;

// import java.util.*;

class Disp_Data implements Runnable{
    char ch='A';
    @Override
    public void run() {

//        for(int i=1;i<=26;i++)
//        {
//            if(i==5)
//            {
//                try{
//                    Thread.sleep(3000);
//                }
//                catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//            System.out.println(ch);
//            ch++;
//        }

        // for(int i=1;i<=50;i++)
        // {
        //     if(i%2==0)
        //     {
        //         System.out.println("A");
        //     }
        // }
    }
}
class Disp_Data2 implements Runnable{
    int sum = 0;

    @Override
    public void run()
    {

       for(int no=1;no<=500;no++)
       {
           sum = 0;
           for(int i=1;i<no;i++)
           {
               if(no%i==0)
               {
                   sum=sum+i;
               }
           }
           if(sum==no)
               System.out.println(no + " Is a perfect number");
       }

        // for(int i=1;i<=50;i++)
        // {
        //     if(i%2!=0)
        //     {
        //         System.out.println(i);
        //     }
        // }
    }
}


public class Multithreading {

    public static void main(String[] args) throws InterruptedException {
        // Scanner si = new Scanner(System.in);

        Disp_Data obj = new Disp_Data();
        Disp_Data2 obj2 = new Disp_Data2();

        Thread t1 = new Thread(obj, "Thread-1");
        t1.start();
//        t1.setPriority(1);
//        t1.join();

        Thread t2 = new Thread(obj2, "Thread-2");
        t2.start();
//        t2.setPriority(10);
    }
}

