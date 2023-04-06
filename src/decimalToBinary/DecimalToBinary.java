package decimalToBinary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num>0) {
            stacks.add(num % 2);
            num = num / 2;
        }
        while (!stacks.isEmpty()) {
            System.out.print(stacks.pop());
        }

    }
}
