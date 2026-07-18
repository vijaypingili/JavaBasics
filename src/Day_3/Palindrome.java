package Day_3;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println(reverse);

        if(num == reverse) {
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("The entered number is not a palindrome number");
        }
    }
}
