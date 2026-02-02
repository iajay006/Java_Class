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
class Demo48
{
   public static void main(String a[])
    {
      A ob=new C();
      ob.show();
      ((B)ob).Disp();
    }
}
