public class numberSmall {
    public static void main(String[] args) {

        int[] array = { 12, 45, 56, 78, -12, 45 };
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < small) {
                small = array[i];
            }
        }

        System.out.println("The smallest number is: " + small);
    }
}
