abstract class A
{
   abstract void Disp();
   A()
   {
     System.out.println("Class A Constructor");
   }
   void Show()
   {
    System.out.println("Class A show Method");
   }
}
class B extends A
{
    B()
    {
     super();
    }
    void Disp()
    {
    System.out.println("Class Disp Method");
    }
}
class Demo46
{
   public static void main(String a[])
     {
      A ob=new B();
      ob.Disp();
      ob.Show();
     }
}