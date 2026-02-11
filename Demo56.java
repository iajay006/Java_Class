
//get priority
class MyThread implements Runnable
{
   public void run()
     {
            System.out.println(Thread.currentThread()+"Hello Java");
      }
}
class Demo56
{
   public static void main(String a[])
    {
      MyThread ob=new MyThread();
      Thread t=new Thread(ob,"1st");
      System.out.println(t.getPriority());
      t.start();
    }
}