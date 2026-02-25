/*use of getChars(int start,int end,char c[],int index)
This method is used to copy the set of unicode characters from the String from the index supplied through the start variable up to the index represented by the end variable into an array c*/
 
class Demo77
{
     public static void main(String a[])
      {
        String s1="Hello World";
        char ch[]=new char[5];
        s1.getChars(1,3,ch,2);
        for(int i=0;i<5;i++)
        System.out.println(ch[i]);
       }
}