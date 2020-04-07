package Scala_01_basic.Scala_01_DataType

import scala.io.StdIn

object InputDemo {
	def main(args: Array[String]): Unit = {
		//从控制台接收用户信息，【姓名，年龄，薪水】
		println("请输入姓名")
		val name = StdIn.readLine()
		println("请输入年龄")
		val age = StdIn.readInt()
		println("请输入薪水")
		val sal = StdIn.readDouble()
		println(s"用户信息为 name = $name, age = $age, sal = $sal")
	}
}
