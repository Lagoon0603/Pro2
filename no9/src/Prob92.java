import java.io.*;

class Prob92 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("message.txt"));
             PrintWriter pw = new PrintWriter(new FileWriter("output92.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.stripTrailing();
                if (line.isEmpty()) {
                    pw.println();
                    continue;
                }
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (i < line.length()) {
                    if (line.charAt(i) == ' ') {
                        sb.append(' ');
                        i++;
                    } else {
                        int start = i;
                        while (i < line.length() && line.charAt(i) != ' ') {
                            i++;
                        }
                        String word = line.substring(start, i);
                        sb.append(word.length()).append(word);
                    }
                }
                pw.println(sb.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
