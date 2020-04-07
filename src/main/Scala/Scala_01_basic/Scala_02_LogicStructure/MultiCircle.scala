package Scala_01_basic.Scala_02_LogicStructure

import scala.io.StdIn

/** 应用实例
  * 1.统计三个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分
  * 2.统计三个班及格人数，每个班有5名同学
  * 3.打印九九乘法表
  * */
object MultiCircle {
	def main(args: Array[String]): Unit = {
		val classNum = 3
		val stuNum = 5
		var score = 0.0
		var classScore = 0.0
		var totalScore = 0.0
		for (i <- 1 to classNum) {
			//先将classScore清零
			classScore = 0.0
			for (j <- 1 to stuNum) {
				println(s"请输入第 $i 班级的第 $j 个学生的成绩")
				score = StdIn.readDouble()
				classScore += score
			}
			//累计totalScore
			totalScore += classScore
			println(s"第 $i 班级的平均分为 ${classScore / stuNum}")
		}
		println(s"所有班级的平均分为${totalScore / (stuNum * classNum)}")
	}
}
