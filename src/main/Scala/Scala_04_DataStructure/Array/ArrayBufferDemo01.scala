package Scala_04_DataStructure.Array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo01 {
	def main(args: Array[String]): Unit = {
		//�䳤����
		//����/����
		val arr = ArrayBuffer[Int](3, 2, 5)

		//׷��ֵ/Ԫ�أ�֧�ֿɱ����
		arr.append(7)
		arr.append(3, 6, 8)
		//���¸�ֵ
		arr(0) = 7

		//����
		//ͨ���±����Ԫ��
		println("arr(1) = " + arr(1))
		//����
		for (i <- arr) {
			println(i)
		}
	}
}
