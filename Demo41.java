//Method Overriding

class X
{
   X()
   {
   System.out.println("X class Constructor");
   }
   void show()
   {
   System.out.println("X class Show Method");
   }

}
class Y extends X
{
     Y()
     {
      System.out.println("Y class Constructor");
     }
     void show()
     {
     System.out.println("Y class Show Method");
     }
}
class Demo41
{
  public static void main(String a[])
   {
    Y ob=new Y();
     ob.show();
   }
}