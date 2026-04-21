public class ComplexNumber {
    int real;
    int imag;

    void print(int a, int b) {
        real = a;
        imag = b;
        System.out.println(real + " + " + imag + "i");
    }

    double abs() {
        return Math.sqrt(real * real + imag * imag);
    }
}