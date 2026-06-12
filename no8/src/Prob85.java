public class Prob85 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (String arg : args) {
            sb.append(arg);
        }
        String input = sb.toString();
        
        if (input.isEmpty()) {
            return;
        }

        if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Incorrect input!");
            return;
        }

        String lowerInput = input.toLowerCase();
        boolean isPalindrome = true;
        int len = lowerInput.length();
        for (int i = 0; i < len / 2; i++) {
            if (lowerInput.charAt(i) != lowerInput.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
