//Multithreading:-
/*Thread:-It is a light weight process.
Process:-Program in execution*/

class MyThread implements Runnable
{
   public void run()
     {
      System.out.println("Hello");
      System.out.println(Thread.currentThread());
      }
}
class Demo54
{
   public static void main(String a[])
    {
      MyThread ob=new MyThread();
      Thread t=new Thread(ob);
      t.start();
    }
}
     