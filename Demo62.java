//sleep()
class MyThread implements Runnable
{
   public void run()
     {
         try
          {
            Thread.sleep(4000);
           }
           catch(InterruptedException e)
            {
             System.out.println("Exception Handeled");
             }
            System.out.println(Thread.currentThread());
      }
}
class Demo62
{
   public static void main(String a[])
    {
      MyThread ob=new MyThread();
      Thread t=new Thread(ob,"1st");
        t.start();
     }
}