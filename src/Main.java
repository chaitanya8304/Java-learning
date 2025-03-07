import java.util.Scanner;

public class Main{

    static void ascendingorder(int[] arr) {
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array in Ascending Order: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void decendingorder(int[] arr){
        int temp=0;
        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array in Decending Order: ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before Sorting: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        ascendingorder(arr);
        decendingorder(arr);

    }

}