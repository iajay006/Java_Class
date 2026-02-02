/*Abstract Class:-If a class declared as abstract then the programmer cannot instantiate that class,which means that programmer cannot create an object of that class.*/
abstract class A
{
   int p=100;
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
    void Disp()
    {
    System.out.println("Class Disp Method");
    }
}
class Demo45
{
   public static void main(String a[])
     {
      B ob=new B();
      ob.Disp();
      ob.Show();
     }
}

