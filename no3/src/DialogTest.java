public class DialogTest {
    public static void main(String[] args) {
        String text = javax.swing.JOptionPane.showInputDialog(null);
        if (text.equals("1")) {
            text = "apple";
        }
        if (text.equals("2")) {
            text = "banana";
        }
        if (text.equals("3")) {
            text = "cherry";
        }
        if (text.equals("4")) {
            text = "durian";
        }
        System.out.println(text);
    }
}