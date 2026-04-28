//use of equals() and hashCode()

class X
{
   int x;
}
class Demo71
{
      public static void main(String a[])
       {
        X ob=new X();
        ob.x=100;
        X ob1=new X();
        ob1.x=200;
        if(ob.equals(ob1))
         System.out.println("We are Same");
        else
         System.out.println("We are Different");
        if(ob==ob1)
         System.out.println("We are Same");
        else
         System.out.println("We are Different");

       }
}