//Static mothods

class Demo8
{
   static void show()
    {
      System.out.println("Static Method");
     }
      public static void main(String a[])
       {
           show();
           Demo8 ob=new Demo8();
           ob.show();
           Demo8.show();
        }
}