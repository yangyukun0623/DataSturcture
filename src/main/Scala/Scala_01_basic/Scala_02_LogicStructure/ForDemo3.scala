package Scala_01_basic.Scala_02_LogicStructure

object ForDemo3 {
	def main(args: Array[String]): Unit = {
		//对数字集合遍历
		//前闭后开
		for (i <- 1 until 10) {
			print(i + " ")
		}
		println("\n-----------------")

		//前后闭合
		for (i <- 1 to 10) {
			print(i + " ")
		}
		println("\n-----------------")

		//遍历字符串
		for (i <- "hello 尚硅谷") {
			print(i + ", ")
		}
		println("\n-----------------")

		//遍历集合
		val list = List("hello", 10, 30, "tom")
		for (item <- list) {
			print(item + ", ")
		}
		println("\n-----------------")
	}
}
