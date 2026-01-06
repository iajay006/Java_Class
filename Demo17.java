//Non-static block:- The Non static block gets executed whenever an object of that class is created
class Demo17
{
     {
     System.out.println("Non-static block 1");    
     }
     Demo17()
     {
     System.out.println("Inside Default constructor");
     }   
     public static void main(String a[])
      {
       System.out.println("Inside Main Method");
       Demo17 ob=new Demo17();
       Demo17 ob1=new Demo17();
      }
     {
     System.out.println("Non-static block 2");    
     }

}
