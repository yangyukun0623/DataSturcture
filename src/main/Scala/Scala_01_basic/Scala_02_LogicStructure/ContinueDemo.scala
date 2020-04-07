package Scala_01_basic.Scala_02_LogicStructure

object ContinueDemo {
	def main(args: Array[String]): Unit = {
		//使用循环守卫实现continue功能
		for (i <- 1 to 10 if i != 2 && i != 3) {
			println("i = " + i)
		}
	}
}
