public class numberMax {
    public static void main(String[] args) {
        
        int[] array = { 12, 45, 56, 78, -12, 45 };
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest number is: " + largest);


    }
}
