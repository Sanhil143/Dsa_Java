
//brute force
public class findPairs {
      public static void FindPairs(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                  for (int j = i + 1; j < arr.length; j++) {
                        System.out.print("("+arr[i] + "," + arr[j]+")");
                  }
            }
            System.out.println();
      }
      public static void main(String args[]) {
            int arr[] = { 7, 14, 21, 28, 35, 42, 49 };
            FindPairs(arr);
      }
}

// (7,14)(7,21)(7,28)(7,35)(7,42)(7,49)
// (14,21)(14,28)(14,35)(14,42)(14,49)
// (21,28)(21,35)(21,42)(21,49)
// (28,35)(28,42)(28,49)
// (35,42)(35,49)
// (42,49)