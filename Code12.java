// cheak armstrong n number  in java
public class Code12
{
    public static void main(String[] args) {
        int num = 407, len;
        // function to get order
        len = order(num);

        // cheak if armstrong
        if (armstrong(num, len))
            System.out.println(num + " is armstrong");
        else
            System.out.println(num + " is armstrong");

    }

    static int order(int x) {
        int len = 0;
        while (x != 0) {
            len++;
            x = x / 10;
        }
        return len;
    }

    static boolean armstrong(int num, int len) {
        int sum = 0, temp, digit;
        temp = num;

        // loop to extract digit . find power & add to sum

        while (temp != 0) {
            // extract digit
            digit = temp % 10;

            // add power to sum

            sum = sum + (int) Math.pow(digit, len);
            temp /= 10;
        }
        ;

        return num == sum;
    }
}