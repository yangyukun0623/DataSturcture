package Scala_01_basic.Scala_02_LogicStructure

import scala.io.StdIn

object IfElseDemo {
	def main(args: Array[String]): Unit = {
		println("������ɼ���")
		val score: Double = StdIn.readDouble()
		if (score == 100){
			println("�ɼ�Ϊ100��ʱ������һ��BMW")
		} else if (score > 80 && score <= 99) {
			println("�ɼ�Ϊ(80, 99]ʱ������һ̨iPhone XS Max")
		} else if (score >= 60 && score <= 80) {
			println("����һ��iPad")
		} else {
			println("û���κν���")
		}
	}
}
