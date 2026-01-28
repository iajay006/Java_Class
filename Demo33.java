class Demo33
{
   public static void main(String a[])
    {
     int arr[][]=new int[3][];
     arr[0]=new int[1];
     arr[1]=new int[2];
     arr[2]=new int[3];
     int i,j,k=0;
     for(i=0;i<3;i++)
      {
       for(j=0;j<=i;j++)
        {
          arr[i][j]=k;
          k++;
         }
      }
      for(i=0;i<3;i++)
      {
       for(j=0;j<=i;j++)
        {
          System.out.print(arr[i][j]+"  ");
         }
       System.out.println();
      }
    }
}

