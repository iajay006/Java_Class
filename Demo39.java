class X
{
   X()
   {
   System.out.println("X class Constructor");
   }
}
class Y extends X
{
     Y()
     {
     super();
     System.out.println("Y class Constructor");
     }
     void show()
     {
     System.out.println("Y class Show Method");
     }
}
class Z extends Y
{
  Z()
  {
   super();
   System.out.println("Z class Constructor");
  }
}

class Demo39
{
  public static void main(String a[])
   {
    Z ob=new Z();
     //ob.show();
   }
}