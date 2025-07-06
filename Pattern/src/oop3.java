class  shape
{
  public  void area()
  {
      System.out.println("display area");
  }

}

class Triangle extends  shape
{

    public void  area(int l,int h)
    {
        System.out.println(1/2 * l * h);
    }
}
public class oop3 {

    public static void main(String[] args) {

        Triangle t = new Triangle();
       t.area();
       t.area(2,23);

    }




}
