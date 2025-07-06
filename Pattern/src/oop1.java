class pen
{
    String color;
    String type;

    public  void  write()
    {
        System.out.println("writing something ");
    }
public  void  color(){
    System.out.println(this.color);
}


}

class  student{
    String name;
    int age;
    public  void  printName(){
        System.out.println(this.name);

    }

   public  void printage()
   {
       System.out.println(this.age);
   }
//

    student(student s2)
    {
        this.name = s2.name;
        this.age = s2.age;
    }
    student()
   {
//     this.name = name;
//     this.age=age;
  }
}

public class oop1 {
    public static void main(String[] args) {
        pen ob = new pen();
        ob.color = "red";
        ob.type ="ball";
//
        ob.write();

        pen ob2 = new pen();
        ob2.color = "black";
        ob2.type = "gel";
//
        ob.color();
        ob2.color();

//
//        student st = new student();
//        st.name = "supreeth";
//        st.age = 20;
//
//        student s2 = new student(st);
//
//        s2.printage();
//        s2.printName();

    }
}
