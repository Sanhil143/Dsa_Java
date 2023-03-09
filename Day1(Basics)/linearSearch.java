public class linearSearch{
      public static int LinearSearch(int arr[],int key){
            for(int i=0; i<arr.length; i++){
                  if(arr[i] == key){
                        return 1;
                  }
            }
            return -1;
      }
      public static void main (String args[]){
            int arr[] = {1,2,5,8,9,7,6,10};
            int key = 7;
            System.out.println(LinearSearch(arr, key));
      }
}