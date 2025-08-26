import java.util.*;
public class ArraySwap {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0,j=n-1;i<=j;i++){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
