package Question1;

public class ReverseDigits {

    static void reverse(int n){
        if (n == 0){
            return;
        }

        int rem = n % 10;
        System.out.print(rem + " ");
        reverse(n/10);
    }
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Digits in reverse order: ");
        reverse(number);

    }
}
                    /*

                    Runtime Stack Representation of the code

               Line 12     | reverse(0)     |          0
               Line 12     | reverse(1)     |       reverse(0)              1
               Line 12     | reverse(12)    |       reverse(1)              2
               Line 12     | reverse(123)   |       reverse(12)             3
               Line 12     | reverse(1234)  |       reverse(123)            4
               Line 12     | reverse(12345) |       reverse(1234)           5
               Line 14     |    main        |

                                Console
                                54321
                     */
