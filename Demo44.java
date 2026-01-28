//Dynamic method dispatch

class X
{
   int i=100;
}
class Y extends X
{
    int i=900;
}
class Demo44 extends Y
{
   public static void main(String a[])
   {
    X ob=new Y();
    System.out.println(ob.i);
    }
}