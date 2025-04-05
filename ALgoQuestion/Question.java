package ALgoQuestion;

public class Question {
    public static void main(String[] args) {
        
     
        int[] var1 = new int[] { 1, 2, 3, 4, 5 };
        byte var2 = 3;

        for (int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] == var2) {
                System.out.println("The Target valuse is  :" + var1[var3]);
                break;
            }
        }
    }
}
