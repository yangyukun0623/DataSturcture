package Scala_04_DataStructure.Array

object ArrayDemo02 {
	def main(args: Array[String]): Unit = {
		//1.创建一个Array对象
		//2.[Int]表示泛型，即该数组中，只能存放Int
		//3.[Any]表示该数组可以存放任意类型
		//4.在没有复制的情况下，各个元素的值为0
//		val arr1 = new Array[Int](4);   //底层 int[] arr1 = new int[4];
//		println(arr1.length)    //4
//		for(i <- arr1) {
//			println(i)
//		}
//		println("--------------------")
//		arr1(3) = 10    //赋值为10
//		for (x <- arr1) {
//			println(x)
//		}

		val arr1 = Array(1, 3, 5, 7)
		val arr2  = Array(2, 4, 6, 8)
		val arr3 = arr1
		println("arr1地址 = " + arr1.hashCode())
		println("arr2地址 = " + arr2.hashCode())
		println("arr3地址 = " + arr3.hashCode())
	}
}
