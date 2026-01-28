//super

class X
{
   int i=100;
}
class Y extends X
{
  int i=900;
   void show()
   {
   System.out.println("I="+i);
   System.out.println("I="+super.i);
   }
}
class Demo38
{
  public static void main(String a[])
   {
    Y ob=new Y();
     ob.show();
   }
}