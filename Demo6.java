//Parametrize Constructor
class A
{
   int x,y;
   /*A()
    {
     x=10;
     y=20;
    }*/
    A(int m,int n)
     {
      x=m;
      y=n;
     }

     void Disp()
     {
       System.out.println("X="+x+"   Y="+y);
      }
}
class B
{
  int p,q;
    B()
    {
     p=50;
     q=60;
    }
    B(int o,int r)
     {
       p=o;
       q=r;
      }
     void Disp()
     {
       System.out.println("P="+p+"   Q="+q);
      }
}
  
class Demo6
{
     public static void main(String a[])
      {
       A ob=new A(78,90);
       B ob1=new B();
       ob.Disp();
       ob1.Disp();
       }
}
   