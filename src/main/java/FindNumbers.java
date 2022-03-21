import java.util.Scanner;

public class FindNumbers {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numbers, min=0, max=0;

        System.out.println("How much you are going to insert numeral? ");
        numbers= input.nextInt();
        for (int i = 0; i <numbers; i++) {
            System.out.println("Please Insert Numbers: ");
            int x = input.nextInt();
            if(min == 0) min = x;
            if(max == 0) max = x;
            min = (min > x) ? x : min;
            max = (max < x) ? x : max;
            }
        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);


        }
    }
