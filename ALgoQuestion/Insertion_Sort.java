package ALgoQuestion;
public class Insertion_Sort{
public static void main(String[] args) {
    int arr[]= {12, 11, 13, 5, 6};
    int n = arr.length;

    for(int i=1;i<n;i++){
        int current = arr[i];
        int prev=i-1;
        while(prev>=0&&arr[prev]>current){
            arr[prev+1]=arr[prev];
            prev--;

        }
        arr[prev+1]=current;
        
    }

}
}































    
