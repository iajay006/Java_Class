//Creation of refrence to a primitive data type

class Demo31
{
   public static void main(String a[])
    {
      int arr[]=new int[1];
      arr[0]=10;
      disp(arr);
      System.out.println(arr[0]);
    }
    static void disp(int []p)
    {
      p[0]=1000;
    }
}