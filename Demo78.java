//public byte[] getBytes()
class Demo78
{
     public static void main(String a[])
      {
        String s1="HELLO";
         int j=s1.length();
        byte b[]=new byte[j];
         b=s1.getBytes();
         for(int i=0;i<j;i++)
        System.out.println(b[i]);
       }
}