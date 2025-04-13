package ALgoQuestion;

public class Selction_Sort {
    public static void main(String[] args) {
        int[] arr={13,4,32,40,50,2};
        int i;
        int minIndex;
        for( i=0;i<arr.length-1;i++){
             minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                  minIndex=j;
            }
        }
    int temp=arr[i]; 
    arr[i]=arr[minIndex];
    arr[minIndex]=temp;



    
for (int num : arr) {

    System.out.print(num + " ");
}
        System.out.println(); 
}

}}