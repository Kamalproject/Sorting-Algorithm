import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Array Size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            System.out.print("Enter the element for index "+i+" ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nAfter sorting array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
