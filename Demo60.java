class MyThread implements Runnable
{
   public void run()
     {
            System.out.println(Thread.currentThread());
            Thread.yield();
            System.out.println(Thread.currentThread());
      }
}
class Demo60
{
   public static void main(String a[])
    {
      MyThread ob=new MyThread();
      MyThread ob1=new MyThread();
      Thread t=new Thread(ob,"1st");
      Thread t1=new Thread(ob1,"2nd");
        t.start();
        t1.start();
     }
}
