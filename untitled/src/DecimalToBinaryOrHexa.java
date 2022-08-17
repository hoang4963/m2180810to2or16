import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinaryOrHexa {
    public static void main(String[] args) {
        System.out.println("Nhap so muon chuyen doi");
        Scanner scanner = new Scanner(System.in);
        int numberNeedConvert = scanner.nextInt();
//        Stack<Integer> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        int count0 = 0;
        int count = 0;
//        System.out.println("Chuyen sang he nhi phan la: ");
//        while (count0 != 1){
//            if (numberNeedConvert/2 == 0)
//                count0++;
//            stack.push(numberNeedConvert%2);
//            numberNeedConvert = numberNeedConvert/2;
//            count++;
//        }
//        for (int i = 0; i <count; i++) {
//            System.out.print(stack.pop());
//        }
        System.out.println("Chuyen sang he hexa la: ");
        while (count0 != 1){
            if (numberNeedConvert/16 == 0)
                count0++;
            stack1.push(covert16(numberNeedConvert%16));
            numberNeedConvert = numberNeedConvert/16;
            count++;
        }
        for (int i = 0; i <count; i++) {
            System.out.print(stack1.pop());
        }
    }

    static String covert16(int number){
        return switch (number) {
            case 1 -> "1";
            case 2 -> "2";
            case 3 -> "3";
            case 4 -> "4";
            case 5 -> "5";
            case 6 -> "6";
            case 7 -> "7";
            case 8 -> "8";
            case 9 -> "9";
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            default -> "F";
        };
    }
}
