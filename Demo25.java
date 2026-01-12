//Object Refrence

class Demo25
{
    int x;
    public static void main(String a[])
    {
     Demo25 ob=new Demo25();
     ob.x=200;
     Demo25 ob1=new Demo25();
     ob1.x=500;
     Swap(ob,ob1);
     System.out.println(ob.x);
     System.out.println(ob1.x);
    }

    static void Swap(Demo25 p,Demo25 q)
     {
       int m=p.x;
        p.x=q.x;
        q.x=m;
      }
}
       
      


    

