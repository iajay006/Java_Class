/*Using readLine()

the readLine() is present in java.io package.The class in which readLine() is present is called BufferedReader class.

Syntax:-
public String readLine() throws IOException
{
////
}

InputStreamReader ob=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ob);

         or
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));*/

import java.io.*;
class Demo21
{
       public static void main(String a[])
       {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String s="";
       System.out.println("Enter String value");
       try
       {
        s=br.readLine();
       }
       catch(IOException p)
        {
        }
      System.out.println("String value="+s);
      } 
}

