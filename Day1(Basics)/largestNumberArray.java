// import java.util.Scanner;

public class largestNumberArray {
      public static int largestNumber(int arr[]){
            int largest = Integer.MIN_VALUE; // -infinity
            for(int i=0; i<arr.length; i++){
                  if(arr[i] > largest){
                        largest = arr[i];
                  }
            }
            return largest;
      }
      public static void main(String args[]) {
            int arr[] = {50,77,90,61,30,45,7};

            System.out.println(largestNumber(arr));
      }
}
