class FindDuplicates {
      public static int findDuplicate(int[] a) {//{1,3,4,2,2}
          
          int n = a.length;
          int i=0;
          while(i<n){
              int correctIndex = a[i]-1;
              if(a[i] != a[correctIndex])
                  {
                      int temp = a[i];
                      a[i] = a[correctIndex];
                      a[correctIndex] = temp;
                  }
  
              else
                  i++;
  
          }
  
          for(i=0;i<n;i++){
              if(a[i] != i+1)
                  return a[i];
          }
  
  
  
      return -1;
      }
      public static void main(String args[]) {
            int a[] = {1,3,4,2,2};
            System.out.print(findDuplicate(a));
      }
  }
  