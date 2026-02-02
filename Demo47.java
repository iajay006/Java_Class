//Interface:-Here in java it doesnot support multiple inheritance where as by using Interface we can handle multiple Inheritance.It is also a refined verson of abstract class.
interface A
{
    void show();
}
interface B extends A
{
  void Disp();
}
class C implements A,B
{
    public void show()
     {
      System.out.println("Interface A show Method");
     }
     public void Disp()
     {
      System.out.println("Interface B Disp Method");
     }
}
class Demo47
{
   public static void main(String a[])
    {
      C ob=new C();
      ob.show();
      ob.Disp();
    }
}
