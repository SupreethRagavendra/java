

class  student2{
    String name;
    int age;



    public  void printinfo(String name)
    {
        System.out.println(name);
    }

    public  void printinfo(String name,int age)
    {
        System.out.println(name + " " + age);
    }

    public  void  printinfo(int age )

    {

        System.out.println(age);

    }



}

public class oop2 {
    public static void main(String[] args) {


        student2 st = new student2();
        st.name = "supreeth";
        st.age = 20;




        st.printinfo(st.name);
        st.printinfo(st.name,st.age);
        st.printinfo(st.age);


    }
}
