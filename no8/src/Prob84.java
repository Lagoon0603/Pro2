public class Prob84 {
    public static void main(String[] args) {
        try {
            Number[] nums = new Double[5];
            nums[0] = Integer.valueOf(10);
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException caught!");
        }
    }
}
