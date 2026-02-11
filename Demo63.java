//sleep()
class MyThread implements Runnable
{
   public void run()
     {
      for(int i=1;i<=5;i++)
       {
         try
          {
            Thread.sleep(4000);
           }
           catch(InterruptedException e)
            {
             }
            System.out.println(Thread.currentThread()+"Value="+i);
         }
      }
}
class Demo63
{
   public static void main(String a[])
    {
      MyThread ob=new MyThread();
      Thread t=new Thread(ob,"1st");
      MyThread ob1=new MyThread();
      Thread t1=new Thread(ob1,"2nd");
        t.start();
        t1.start();
     }
}