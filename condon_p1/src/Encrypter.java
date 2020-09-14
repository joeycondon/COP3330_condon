import java.util.Arrays;
import java.util.Scanner;
public class Encrypter {
    /* Test the function*/
    public static void main(String[] args) {
        System.out.println("Please enter your data to be encrypted.");
        Scanner input = new Scanner(System.in);
        String data = input.next();
        encrypt(data);
    }

    public static String encrypt(String data) {
        int num = Integer.parseInt(data);
        while (num > 1) {
            int num4 = num % 100;
            num /= 10;
            int num3 = num % 100;
            num /= 10;
            int num2 = num % 100;
            num /= 10;
            int num1 = num % 100;
            num /= 10;

            num1 = (num1 + 7) % 10;
            num2 = (num2 + 7) % 10;
            num3 = (num3 + 7) % 10;
            num4 = (num4 + 7) % 10;

            int temp = 0;
            temp = num1;
            num1 = num3;
            num3 = temp;
            temp = num2;
            num2 = num4;
            num4 = temp;

            String x = "" + num1 + num2 + num3 + num4;
            data =  x;
            System.out.println(data);
            return data;
        }
        return data;
    }
}