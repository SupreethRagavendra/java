public class Binarysearch {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int target = 2;

        System.out.println(bs(arr,target,0, arr.length-1));


    }



    static int bs(int arr[] , int target,int low ,int high)
    {
      if (low>high)
      {
          return -1;
      }

      int middle = (low + high )/2;

      if (arr[middle]==target)
      {
          return  middle;
      }

      if (target<arr[middle])
      {
          return  bs(arr,target,low,middle-1);
      }
      return  bs(arr,target,middle+1,high);
    }
}
