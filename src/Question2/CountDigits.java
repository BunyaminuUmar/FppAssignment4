package Question2;

public class CountDigits {
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + countDigits(n / 10);
        }
    }
    public static void main(String[] args) {
        int number = 12345;
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);
    }
}
 /*

                    Runtime Stack Representation of the code

               Line 8     | countDigits(0)     |          0
               Line 8     | countDigits(1)     |     1 +  countDigits(0)              1+0=1
               Line 8     | countDigits(12)    |     1 +  countDigits(1)              1+1=2
               Line 8     | countDigits(123)   |     1 +  countDigits(12)             1+2=3
               Line 8     | countDigits(1234)  |     1 +  countDigits(123)            1+3=4
               Line 8     | countDigits(12345) |     1 +  countDigits(1234)           1+4=5
               Line 11    |    main            |

                            Console
                              5
                     */

