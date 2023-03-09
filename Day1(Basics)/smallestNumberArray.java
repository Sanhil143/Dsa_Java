
public class smallestNumberArray {
      public static int smallestNumber(int arr[]){
            int smallest = Integer.MAX_VALUE;  //+infinity
            for(int i=0; i<arr.length; i++){
                  if(arr[i] < smallest){
                        smallest = arr[i];
                  }
            }
            return smallest;
      }
       public static void main(String args[]) {
            int arr[] = {7,77,85,24,56,31};
            System.out.println(smallestNumber(arr));
      }
}
