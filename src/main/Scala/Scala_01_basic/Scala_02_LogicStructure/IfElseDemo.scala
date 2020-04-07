package Scala_01_basic.Scala_02_LogicStructure

import scala.io.StdIn

object IfElseDemo {
	def main(args: Array[String]): Unit = {
		println("请输入成绩：")
		val score: Double = StdIn.readDouble()
		if (score == 100){
			println("成绩为100分时，奖励一辆BMW")
		} else if (score > 80 && score <= 99) {
			println("成绩为(80, 99]时，奖励一台iPhone XS Max")
		} else if (score >= 60 && score <= 80) {
			println("奖励一个iPad")
		} else {
			println("没有任何奖励")
		}
	}
}
