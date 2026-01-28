//Array ob objects

class Demo34
  {
    int x;
    public static void main(String a[])
    {
     Demo34 ob[]=new Demo34[3];
     ob[0]=new Demo34();
     ob[0].x=5000;
     ob[1]=new Demo34();
     ob[1].x=6000;
     ob[2]=new Demo34();
     ob[2].x=7000;
     for(int i=0;i<3;i++)
     System.out.println(ob[i].x);
    }
}

   