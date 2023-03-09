
public class ReverseArray {

      public static void reverseArray(int arr[]){
            int i = 0;
            int j = arr.length -1;
            while(i<j){
                  arr[i] = arr[i] + arr[j];
                  arr[j] = arr[i] - arr[j];
                  arr[i] = arr[i] - arr[j];
                  i++;
                  j--;
            }
            
      }
      public static void main(String args[]){
            int arr[] = {15,51,78,94,65,7};
            reverseArray(arr);
            for(int i=0; i<arr.length; i++){
                  System.out.print(arr[i]+" ");
            }
            
      }
}
