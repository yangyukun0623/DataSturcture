package DataStructure.Sort;

public class ChoiceSort {
    public static int[] sort(int[] array){
        //�ܹ�Ҫ����N-1�ֱȽ�
        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            //ÿ����Ҫ�ȽϵĴ���
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;//��¼Ŀǰ���ҵ�����СֵԪ�ص��±�
                }
            }
            //���ҵ�����Сֵ��iλ�ý��н���
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
