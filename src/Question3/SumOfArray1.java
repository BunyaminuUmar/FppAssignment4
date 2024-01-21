package Question3;

public class SumOfArray1 {
    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return arr[n - 1] + sumArray(arr, n - 1);
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int arraySum = sumArray(array, array.length);
        System.out.println("Sum of array elements: " + arraySum);
    }
}

                    /*

                    Runtime Stack Representation of the code

               Line 8     | sumArray({1,2,3,4,5}, 0) |          0
               Line 8     | sumArray({1,2,3,4,5}, 1) |     1 + sumArray({1,2,3,4,5}, 0)         1
               Line 8     | sumArray({1,2,3,4,5}, 2) |     2 + sumArray({1,2,3,4,5}, 1)         1+2=3
               Line 8     | sumArray({1,2,3,4,5}, 3) |     3 + sumArray({1,2,3,4,5}, 2)         3+3=6
               Line 8     | sumArray({1,2,3,4,5}, 4) |     4 + sumArray({1,2,3,4,5}, 3)         6+4=10
               Line 8     | sumArray({1,2,3,4,5}, 5) |     5 + sumArray({1,2,3,4,5}, 4)         10+5=15
               Line 11    |    main                  |

                                Console
                          Prints 15 on the console
                     */
