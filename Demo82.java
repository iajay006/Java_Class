class Demo82
{
    String name;
    static int roll;
      String getName(String s)
       {
        name=s;
        return name;
        }
       static int getRoll(int r)
        {
         roll=r;
         return roll;
         }
         static class Stud
           {
             int age=25;
             static String address="Ranchi";
              static void Display()
               {
                Demo82 ob=new Demo82();
                Stud p=new Stud();
                System.out.println("Name is="+ob.getName("Sumit"));
                System.out.println("Roll No="+Demo82.getRoll(78));
                System.out.println("Age="+p.age+" Address="+Stud.address);
                }
            }
       public static void main(String a[])
          {
          Stud.Display();
           }
   }
              
