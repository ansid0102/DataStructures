package Arrays_Strings;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        Integer arr[]={5,4,3,2,1};
        usingExtraArray(arr);
        usingLoopIp(arr);
        usingRec(arr,arr.length-1);
        
        System.out.println("Reversing with recursion"+Arrays.toString(arr));
    }

    public static void usingExtraArray(Integer[] arr) {
        int len = arr.length;
        int[] newArr = new int[len];

        for(int i=len-1;i>-1;i--){
            newArr[len-i-1]=arr[i];
        }
        System.out.println("Using extra array: ");
        System.out.println(Arrays.toString(newArr));
    }
    // Ip = Inplace
    public static void usingLoopIp(Integer arr[]) {
        int len = arr.length;
        for(int i=0;i<len/2;i++){
            int buffer = arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=buffer;
        }
        System.out.println("Inplace with loop");
        System.out.println(Arrays.toString(arr));
    }

    // Using Recursion
    public static void usingRec(Integer[] arr,int ind){
        int len = arr.length;
        if(ind<=len/2){
            return;
        }
        int buffer = arr[len-ind-1];
        arr[len-ind-1]=arr[ind];
        arr[ind]=buffer;
        usingRec(arr, ind-1);
    }
}