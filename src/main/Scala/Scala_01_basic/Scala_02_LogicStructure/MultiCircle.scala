package Scala_01_basic.Scala_02_LogicStructure

import scala.io.StdIn

/** Ӧ��ʵ��
  * 1.ͳ��������ɼ������ÿ������5��ͬѧ������������ƽ���ֺ����а༶��ƽ����
  * 2.ͳ�������༰��������ÿ������5��ͬѧ
  * 3.��ӡ�žų˷���
  * */
object MultiCircle {
	def main(args: Array[String]): Unit = {
		val classNum = 3
		val stuNum = 5
		var score = 0.0
		var classScore = 0.0
		var totalScore = 0.0
		for (i <- 1 to classNum) {
			//�Ƚ�classScore����
			classScore = 0.0
			for (j <- 1 to stuNum) {
				println(s"������� $i �༶�ĵ� $j ��ѧ���ĳɼ�")
				score = StdIn.readDouble()
				classScore += score
			}
			//�ۼ�totalScore
			totalScore += classScore
			println(s"�� $i �༶��ƽ����Ϊ ${classScore / stuNum}")
		}
		println(s"���а༶��ƽ����Ϊ${totalScore / (stuNum * classNum)}")
	}
}
