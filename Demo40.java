class X
{
   X(int p)
   {
   System.out.println("X class Constructor");
   }
}
class Y extends X
{
     Y(int q)
     {
      super(300);
     System.out.println("Y class Constructor");
     }
     void show()
     {
     System.out.println("Y class Show Method");
     }
}
class Z extends Y
{
  Z(int r)
  {
   super(500);
   System.out.println("Z class Constructor");
  }
}

class Demo40
{
  public static void main(String a[])
   {
    Z ob=new Z(600);
     //ob.show();
   }
}