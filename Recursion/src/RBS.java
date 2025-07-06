public class RBS {

    public static void main(String[] args) {
        int [] arr={10,20,30,50,60};

        int target = 330;

        System.out.println(search(arr,target,0, arr.length-1));

    }

    static  int search(int[] arr,int target, int s,int e) {
        if (s > e) {
            return -1;
        }
        int mid = (s + e) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[s] <= arr[mid])
        {
            if (target>=arr[s] && target<=arr[mid])
            {
              return  search(arr,target,s,mid-1);
            }
            else {
                return  search(arr,target,mid+1,e);
            }
        }

        if (target>=arr[mid] && target<=arr[e])
        {
            return search(arr,target,mid+1,e);
        }
        else
        {
            return search (arr,target,s,mid-1);
        }


    }
}

