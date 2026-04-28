/* String(byte b[])
String(byte b[],int start,int length)*/
class Demo68
{
     public static void main(String a[])
      {
      byte ascii[]={65,66,67,68,69,70};
      String s1=new String(ascii);
      System.out.println(s1);
      String s2=new String(ascii,2,3);
      System.out.println(s2);
       }
}