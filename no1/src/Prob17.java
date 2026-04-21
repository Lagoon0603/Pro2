
public class Prob17 {
	public static void main(String[] args) {
		int a=6202;
		int b=14;
		while(a%b!=0) {
		a=b;
		b=a%b;
		}
		System.out.println(b);
	}
}