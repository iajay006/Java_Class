//get priority
class MyThread implements Runnable
{
   public void run()
     {
            System.out.println(Thread.currentThread()+"Hello Java");
      }
}
class Demo57
{
   public static void main(String a[])
    {
      MyThread ob=new MyThread();
      Thread t=new Thread(ob,"1st");
      MyThread ob1=new MyThread();
      Thread t1=new Thread(ob1,"2nd");
      MyThread ob2=new MyThread();
      Thread t2=new Thread(ob2,"3rd");
      System.out.println(t.getPriority());
      System.out.println(t1.getPriority());
      System.out.println(t2.getPriority());
      t.start();
      t1.start();
      t2.start();
    }
}