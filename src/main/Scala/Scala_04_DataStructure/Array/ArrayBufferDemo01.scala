package Scala_04_DataStructure.Array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo01 {
	def main(args: Array[String]): Unit = {
		//变长数组
		//定义/声明
		val arr = ArrayBuffer[Int](3, 2, 5)

		//追加值/元素，支持可变参数
		arr.append(7)
		arr.append(3, 6, 8)
		//重新赋值
		arr(0) = 7

		//访问
		//通过下标访问元素
		println("arr(1) = " + arr(1))
		//遍历
		for (i <- arr) {
			println(i)
		}
	}
}
