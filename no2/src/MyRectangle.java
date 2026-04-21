public class MyRectangle {
    MyPointNew point1, point2;
    void setPoints(int a, int b, int c, int d) {
        point1 = new MyPointNew();
        point1.x = a;
        point1.y = b;
        point2 = new MyPointNew();
        point2.x = c;
        point2.y = d;
    }

    int computeLength() {
        return Math.abs(point1.x - point2.x);
    }

    int computeWidth() {
        return Math.abs(point1.y - point2.y);
    }


    int computeArea() {
        int l = computeLength();
        int w = computeWidth();
        return l*w;
    }

    int computeCircumference() {
        int l = computeLength();
        int w = computeWidth();
        return 2*(l+w);
    }
}