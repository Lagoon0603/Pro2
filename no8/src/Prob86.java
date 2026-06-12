public class Prob86 {
    public static void main(String[] args) {
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            int origNum1 = num1;
            int origNum2 = num2;
            
            int sum = 0;
            while (true) {
                if (num1 % 2 != 0) {
                    sum += num2;
                }
                if (num1 <= 1) {
                    break;
                }
                num1 /= 2;
                num2 *= 2;
            }
            
            System.out.println(origNum1 + " * " + origNum2 + " = " + sum);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input TWO integers");
        } catch (NumberFormatException e) {
            System.out.println("Please input INTEGERs");
        }
    }
}
