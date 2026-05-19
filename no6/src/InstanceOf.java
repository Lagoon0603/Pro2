class X {
}

class Y extends X {
}

public class InstanceOf {
	public static void main(String[] args) {
		System.out.println("a) " + ((new X()) instanceof X));
		System.out.println("b) " + ((new Y()) instanceof Y));
		System.out.println("c) " + ((new X()) instanceof Y));
		System.out.println("d) " + ((new Y()) instanceof X));
		System.out.println("e) " + ((new X()) instanceof Object));
		System.out.println("f) " + ((new Y()) instanceof Object));			
	}
}
