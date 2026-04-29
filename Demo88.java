public class Demo88
{
     final static int a1=100; //simple variable not accepted
     //static int a1=100;
    public static void main(String a[])
     {
      class X
         {
            int j=a1;
          } 
       System.out.println(new X().j);
      }
}