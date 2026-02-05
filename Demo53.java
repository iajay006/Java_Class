/*Chained Exception

public Throwable(String msg,Throwable t);
public Throwable(Throwable t);
Methods
public Throwable getCause();
public Throwable getMessage();*/

class MyException extends Exception
{
   MyException(String msg)
    {
        super(msg);
    }
}
class Demo53
{
     public static void main(String a[])throws MyException
      {
         try
           {
            int r=10/0;
            }
           catch(Exception e)
             {
              System.out.println(e.getMessage());
              System.out.println(e.getCause());
              throw new MyException("Chained Exception");
              }
        }
}
