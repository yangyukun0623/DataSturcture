package Scala_01_basic.Scala_01_DataType

import scala.io.StdIn

object InputDemo {
	def main(args: Array[String]): Unit = {
		//�ӿ���̨�����û���Ϣ�������������䣬нˮ��
		println("����������")
		val name = StdIn.readLine()
		println("����������")
		val age = StdIn.readInt()
		println("������нˮ")
		val sal = StdIn.readDouble()
		println(s"�û���ϢΪ name = $name, age = $age, sal = $sal")
	}
}
