import java.util.Scanner;

class Prob91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("Please input numbers: ");
        
        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            String[] tokens = line.split("\\s+");
            
            for (int i = 0; i < tokens.length; i++) {
                String token = tokens[i];
                
                if (token.isEmpty()) {
                    continue;
                }
                
                if (token.equals("quit")) {
                    System.exit(0);
                } else if (token.equals("end")) {
                    System.out.println(sum);
                    sum = 0;
                    System.out.println("Please input numbers: ");
                } else {
                    sum += Integer.parseInt(token);
                }
            }
        }
    }
}