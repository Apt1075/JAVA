import java.util.Scanner;
public class Binary_search{

    public static Scanner scn =  new Scanner(System.in);
    
    public static void input1d(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void print1d(int[] arr) {
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" "); // arr[i] = scn.nextInt();
        }
    }
  

    public static int binary_search(int arr[], int data){// 40 60 100 150 180 data = 100
        int si = 0 , ei =arr.length-1,mid; //              mid si          ei
        while(si<=ei){//0+7/2 = 3
            mid = (si+ei)/2;
            if(arr[mid] == data){ //40 == 100
                return mid;
            }else if(arr[mid]<data){  // 40<100
              si= mid+1;
            }else{
               ei =  mid-1;
            }
        }
        if(si>ei)
        System.out.println("Number Not Found");
        return -1;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr  = new int [n];
        input1d(arr);
        int element = scn.nextInt();
        int k =binary_search(arr, element);
        System.out.println(k);
    }

}