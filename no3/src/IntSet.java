public class IntSet {
    int[] array;
    int num;

    public void init() {
        array = new int[4];
        num = 0;
    }

    public void add(int v) {
        if (find(v)==false) {
            if (num < 4) array[num++] = v;
        }
    }

    public boolean find(int v){
        for (int i = 0; i < num; i++) if (array[i] == v) return true; return false;
    }

    int count(){
        return num;
    }

    void remove(int v){
        for (int i = 0; i < num; i++) {
            if (array[i] == v) {
                for (int j = i; j < num - 1; j++) {
                    array[j] = array[j + 1];
                }
                num--;
                break;
            }
        }
    }

    int getIndex(int v) {
        for (int i = 0; i < num; i++) {
            if (array[i] == v) {
                return i;
            }
        }
        return -1;
    }
}