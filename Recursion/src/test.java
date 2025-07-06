public class test {

    public static void main(String[] args) {

        int rev= 0;
        int n = 125;
        rev(n,rev);


    }
      static  void rev(int a,int rev)
      {


          if (a==0)
          {
              System.out.println(rev);
              return;
          }
          int n= a % 10;
          rev = (rev * 10)+ n;
          a=a/10;
          rev(a,rev);




      }
}
