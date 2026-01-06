//Constructor overloading
class A
{
    int x,y;
      A()
      {
       x=100;
       y=200;
      }
      A(int p,int q)
      {
       x=p;
       y=q;
      }
      A(int p)
      {
      x=y=p;
      }
      A(A ob)
      {
       x=ob.x;
       y=ob.y;
      }
      void display()
      {
       System.out.println("X="+x+"   Y="+y);
      }
}
class Demo9
{
    public static void main(String a[])
      {
       A ob=new A();
       A ob1=new A(34,78);
       A ob3=new A(90);
       A ob4=new A(ob1);
        ob.display();
	ob1.display();
	ob3.display();
	ob4.display();
      }
}