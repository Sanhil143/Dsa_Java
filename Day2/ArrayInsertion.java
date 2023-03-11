
public class ArrayInsertion {
      public static int[] arrayInsertion(int arr[], int position, int element) {
            int n = arr.length;
            int newarr[] = new int[n + 1];
            for (int i = 0; i < n + 1; i++) {
                  if (i < position - 1) {
                        newarr[i] = arr[i];
                  } else if (i == position - 1) {
                        newarr[i] = element;
                  } else {
                        newarr[i] = arr[i - 1];
                  }
            }
            return newarr;

      }

      public static void main(String args[]) {
            int arr[] = { 1, 2, 3, 4, 5, 7, 8 };
            int position = 5;
            int element = 6;
            
           arrayInsertion(arr, position, element);
           for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
           }
      }
}
