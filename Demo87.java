public class Demo87
{
      int a=100;
    public static void main(String a[])
     {
      Demo87 ob=new Demo87();
      ob.fun();
      }
     void fun()
       {
        class X
         {
            int j=a;
          } 
       System.out.println(new X().j);
      }
}