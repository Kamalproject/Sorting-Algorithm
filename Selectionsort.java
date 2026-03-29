import java.util.Scanner;

public class Selectionsort {    
    public static void PrintArray(int array[]){
        int n=array.length;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        //Array initaliztion
        
        for(int i=0;i<n;i++){
            System.out.print("Enter the element for index "+i+" ");
            arr[i]=sc.nextInt();
        }
        
        //Display the original Array
        
        System.out.println("Original array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        //This portion perform the Sorting operation
        
        System.out.println("\nAfter sorting array");
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
                
            }
            //Here we Swap the numbers
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;  
            
            
        }
        PrintArray(arr);
    }
}
