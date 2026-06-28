import java.io.*;

class Prob93 {
    public static void main(String[] args) {
        int totalLines = 0;
        int totalChars = 0;
        for (String filename : args) {
            int lines = 0;
            int chars = 0;
            try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
                int c;
                while ((c = br.read()) != -1) {
                    chars++;
                    if (c == '\n') lines++;
                }
                System.out.printf("%3d %5d %s\n", lines, chars, filename);
                totalLines += lines;
                totalChars += chars;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (args.length > 0) {
            System.out.printf("%3d %5d total\n", totalLines, totalChars);
        }
    }
}
