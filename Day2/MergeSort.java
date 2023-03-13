public class MergeSort {
      public static void printArray(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
      }

      public static void mergeSort(int arr[], int start, int end) {
            if(start >= end){
                  return;
            }
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid); // left part
            mergeSort(arr, mid + 1, end); // right part
            merge(arr, start, mid, end);
      }

      public static void merge(int arr[],int start, int mid, int end){
            int temp[] = new int[end-start+1];
            int i = start; //left
            int j = mid+1; //right
            int k = 0; //temp

            while(i<=mid && j<=end){
                  if(arr[i] < arr[j]){
                        temp[k] = arr[i];
                        i++;
                  }else{
                        temp[k] = arr[j];
                        j++;
                  }
                  k++;
            }
            while(i <= mid){
                  temp[k++] = arr[i++];
            }
            while(j <= end){
                  temp[k++] = arr[j++];
            }
            //copying temp to main arr array
            for(k=0,i=start; k<temp.length; k++,i++){
                  arr[i] = temp[k];
            }
      }

      public static void main(String args[]) {
            int arr[] = { 18, 47, 28, 10, 7, 55 };
            mergeSort(arr, 0, arr.length - 1);
            printArray(arr);
      }
}
