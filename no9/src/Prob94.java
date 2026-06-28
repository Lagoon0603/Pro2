import java.util.*;

class Prob94 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String line = scan.nextLine().trim();

            if (line.equals("quit")) {
                break;
            }

            String[] tokens = line.split("\\s+");
            Stack<Integer> stack = new Stack<>();

            for (String token : tokens) {
                if (token.equals("+")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a + b);
                } else if (token.equals("-")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                } else if (token.equals("*")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a * b);
                } else if (token.equals("/")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                } else {
                    stack.push(Integer.parseInt(token));
                }
            }

            System.out.println(stack.pop());
        }

        scan.close();
    }
}