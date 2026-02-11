class MyThread implements Runnable
{
   public void run()
     {
            System.out.println(Thread.currentThread()+"Hello Java");
      }
}
class Demo59
{
   public static void main(String a[])
    {
      MyThread ob=new MyThread();
      Thread t=new Thread(ob,"1st");
      MyThread ob1=new MyThread();
      Thread t1=new Thread(ob1,"2nd");
       t.setPriority(8);
        t1.setPriority(4);
        t.start();
        t1.start();
     }
}
   