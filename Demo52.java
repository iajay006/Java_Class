class Demo52
{
    void show()
     {
      try
        {
         throw new Error();
         }
        catch(Error e)
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
        Demo52 ob=new Demo52();
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