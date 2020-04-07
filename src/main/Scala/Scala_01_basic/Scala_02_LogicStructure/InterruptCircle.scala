package Scala_01_basic.Scala_02_LogicStructure

import scala.util.control.Breaks

object InterruptCircle {
	def main(args: Array[String]): Unit = {
		var n =1
		Breaks.breakable {
			while (n <= 20) {
				n += 1
				println("n = " + n)
				if (n == 18) {
					Breaks.break()
				}
			}
		}
		println("ok~~~")
	}
}
