//Unchecked Exception

class Demo51
{
    void show()
     {
      try
        {
         throw new Error();
         }
        catch(Exception e)
         {
           System.out.println("Java World");
          }
      }
      void Disp()
      {
         throw new Error();
       }
      public static void main(String a[])
       {
        Demo51 ob=new Demo51();
          ob.show();
           try
             {
              ob.Disp();
              }
              catch(Throwable t)
               {
                 System.out.println("Hello java");
                }
         }
}