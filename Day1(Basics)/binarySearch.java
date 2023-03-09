
public class binarySearch {
      public static int BinarySearch(int arr[], int key) {
            int i = 0;
            int j = arr.length - 1;
            while(i<=j){
                  int mid = (i+j)/2;
                  if(arr[mid] == key){
                        return arr[mid]; 
                  }
                  else if(arr[mid] < key){
                        i = mid+1;
                  }
                  else if(arr[mid] < key){
                        j = mid-1;
                  }
            }
            return -1;
      }

      public static void main(String args[]) {
            int arr[] = { 2, 8, 10, 18, 22, 35, 45, 50 };
            int key = 45;
            System.out.println(BinarySearch(arr, key));
      }
}
