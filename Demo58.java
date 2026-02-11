//set priority
class MyThread implements Runnable
{
   public void run()
     {
            System.out.println(Thread.currentThread()+"Hello Java");
      }
}
class Demo58
{
   public static void main(String a[])
    {
      MyThread ob=new MyThread();
      Thread t=new Thread(ob,"1st");
       t.setPriority(8);
        t.start();
     }
}
     