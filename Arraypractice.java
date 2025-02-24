 public class Arraypractice {
    public static void main(String[] atgs){
    int[] square =new int[10];
    for( int i= 0; i<10;i++){
square[i]=(i+1)*(i+1);
    }
    for(int i=0; i<10;i++){
        int s=i+1;
        System.out.printf("\n Square of %d : %d ",s,square[i]);
    }
 
}
}
