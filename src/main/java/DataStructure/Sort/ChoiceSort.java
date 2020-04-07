package DataStructure.Sort;

public class ChoiceSort {
    public static int[] sort(int[] array){
        //总共要经过N-1轮比较
        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            //每轮需要比较的次数
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;//记录目前能找到的最小值元素的下标
                }
            }
            //将找到的最小值和i位置进行交换
            if (i != min){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }

    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,2,8,9,5,7,6,1,3};
        array = sort(array);
        display(array);
    }
}
