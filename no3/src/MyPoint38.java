public class MyPoint38 {
	private int x;
	private int y;

	void setPoint(int xpos, int ypos) {
		x = xpos;
		y = ypos;
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	double getDistance() {
		return Math.sqrt(x*x + y*y);
	}

	double getDistanceFrom(MyPoint38 q) {
		int dx = x - q.getX();
		int dy = y - q.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}
}
