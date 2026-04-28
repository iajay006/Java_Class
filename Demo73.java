//hashCode()
class Demo73
{
      public static void main(String a[])
      {
        String ob=new String("Java");
        String ob1=new String("Java");
        if(ob.equals(ob1))
         System.out.println("We are Same");
        else
         System.out.println("We are Different");
        if(ob==ob1)
         System.out.println("We are Same");
        else
         System.out.println("We are Different");
         System.out.println(ob.hashCode());
         System.out.println(ob1.hashCode());
       }
}