package Scala_01_basic.Scala_02_LogicStructure

object ForDemo3 {
	def main(args: Array[String]): Unit = {
		//�����ּ��ϱ���
		//ǰ�պ�
		for (i <- 1 until 10) {
			print(i + " ")
		}
		println("\n-----------------")

		//ǰ��պ�
		for (i <- 1 to 10) {
			print(i + " ")
		}
		println("\n-----------------")

		//�����ַ���
		for (i <- "hello �й��") {
			print(i + ", ")
		}
		println("\n-----------------")

		//��������
		val list = List("hello", 10, 30, "tom")
		for (item <- list) {
			print(item + ", ")
		}
		println("\n-----------------")
	}
}
