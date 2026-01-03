class thisDemo
{
  int x;
  void input(int x)
  {
    this.x=x;
  }
  void output()
  {
   System.out.println("x is : "+x);
  }
  public static void main(String args[])
  {
   thisDemo obj=new thisDemo();
   obj.input(22);
   obj.output();
  }
 }