/*Local Inner class
class X
{
    void show()
     {
      class Y
       {
       }
     }
}
1. A local inner class is declared through a no-access modifier,but cannot be declared through public,private and protected access modifier.
2.A local inner class access the private member of the outer class.
3.A local inner class non-static member directly access the static member of the outer class.
*/
public class Demo86
{
     static int a=100;
    public static void main(String a[])
     {
     Demo86 ob=new Demo86();
      ob.fun();
      }
     void fun()
      {
        class X
         {
            int j=a;
          } 
       System.out.println(new X().j);
      }
} 
