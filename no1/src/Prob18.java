
public class Prob18 {
	public static void main(String[] args) {
		for(int i=1;i<1001;i++) {
			int b=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
				b=b+j;
				}
			}
			if(b==i) {
				System.out.println(i);
			}
		}
	}
}