import java.util.* ;
//demo interface
class ABC //super class
{
  void show()
     {
        System.out.println("I am show() of ABC.parent");
     }
}

interface PQR //first interface
{
  int a=100; //variable declaration
  void disp();
}

interface MNO extends PQR//second interface
{
  int b=200; //variable declaration
  int c=a+b;
  void sum(); //method declaration
}

class XYZ extends ABC implements PQR,MNO //inheritancing ABC and implementing PQR,MNO
{
  public void disp()
    {
       System.out.println("I am implementing the disp() of interface PQR");
       System.out.println(a);
    }

  public void sum()
    {
       System.out.println("I am implementing the sum() of interface MNO");
       System.out.println(b);
       System.out.println(c);

    }

  public static void main(String args[])
    {
       XYZ obj=new XYZ();
       obj.show();
       obj.disp();
       obj.sum();
    }
}