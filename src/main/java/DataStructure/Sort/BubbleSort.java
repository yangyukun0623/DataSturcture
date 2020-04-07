package DataStructure.Sort;

import DataStructure.Array.MyArray;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4,2,8,9,5,7,6,1,3};
        arr = bubbleSort(arr);
        MyArray array = new MyArray(arr);
        array.display();
    }
}
