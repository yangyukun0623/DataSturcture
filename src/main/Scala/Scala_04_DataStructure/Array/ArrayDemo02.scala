package Scala_04_DataStructure.Array

object ArrayDemo02 {
	def main(args: Array[String]): Unit = {
		//1.����һ��Array����
		//2.[Int]��ʾ���ͣ����������У�ֻ�ܴ��Int
		//3.[Any]��ʾ��������Դ����������
		//4.��û�и��Ƶ�����£�����Ԫ�ص�ֵΪ0
//		val arr1 = new Array[Int](4);   //�ײ� int[] arr1 = new int[4];
//		println(arr1.length)    //4
//		for(i <- arr1) {
//			println(i)
//		}
//		println("--------------------")
//		arr1(3) = 10    //��ֵΪ10
//		for (x <- arr1) {
//			println(x)
//		}

		val arr1 = Array(1, 3, 5, 7)
		val arr2  = Array(2, 4, 6, 8)
		val arr3 = arr1
		println("arr1��ַ = " + arr1.hashCode())
		println("arr2��ַ = " + arr2.hashCode())
		println("arr3��ַ = " + arr3.hashCode())
	}
}
