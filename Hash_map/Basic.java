// Source code is decompiled from a .class file using FernFlower decompiler.
package Hash_map;
import java.util.Scanner;

public class Basic {
  
    public static void main(String[] var0) {
        int[] var1 = new int[] { 34, 1, 6, 8, 2, 1, 4, 1 };
        Scanner var2 = new Scanner(System.in);
        int var3 = var2.nextInt();
        int var4 = 0;

        for (int var5 = 0; var5 < var1.length; ++var5) {
            if (var1[var5] == var3) {
                ++var4;
            }
        }

    }
}
