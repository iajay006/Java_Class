/*Final class:-If a class is declared as final then the class cannot be Inherited.
  Final method cannot be overriden
  We never use abstract keyword
Final Variable:-
final static int i=100;(constant variable)*/
class X
{
    int p=100;
    void show()
     {
      System.out.println("Class X show Method");
     }
}
final class Y extends X
{
    int q=100;
    void show1()
     {
      System.out.println("Class Y show Method");
     }
}
class Z extends Y
{
    int r=100;
    void show2()
     {
      System.out.println("Class Z show Method");
     }
}
class Demo49 
{
   public static void main(String a[])
    {
     Z ob=new Z();
     ob.show();
     ob.show1();
     ob.show2();
    }
}
