class OverloadingDemo
{
  void display()
  {
    System.out.println("OverloadingDemo with no parameters");
  }
  void display(int x)
  {
    System.out.println("OverloadingDemo with one int value: "+x);
  }
  void display(double x,double y)
  {
    System.out.println("OverloadingDemo with 2 double values: "+x+" "+y);
  }
public static void main(String args[])
{
  OverloadingDemo d1=new OverloadingDemo();
  d1.display();
  d1.display(23);
  d1.display(23,34);   
}
}