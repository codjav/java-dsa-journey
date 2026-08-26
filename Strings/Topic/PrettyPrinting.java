package Strings.Topic;

public class PrettyPrinting {
    public static void main(String[] args) {
        
        /* 
        * List of Placeholders in String -
        * %c - Character
        * %d - decimal number
        * %e - exponential floating point
        * %f - floating point number
        * %i - integer base 10
        * %o - octal
        * %s - string
        * %u - unsigned decimal
        * %x - hexadecimal
        * %t - date/time
        * %n - newline 
        */

        float a = 45.8267f;
        System.out.printf("Formatted value is: %.2f", a);

        System.out.println();

        System.out.printf("Value of pi: %.3f", Math.PI);

        System.out.println();

        System.out.printf("Hello my name is %s. And I am %s", "Mohammad Javed Ali", "Muslim");
    }
}
