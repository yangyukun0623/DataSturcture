package Scala_01_basic.Scala_02_LogicStructure

object IfElseDemo1 {
	def main(args: Array[String]): Unit = {
		val a : Int = 3
		val b : Int = 100
		val c : Int = 6
		val m : Int = b * b - 4 * a * c
		var x1 = 0.0
		var x2 = 0.0
		if (m > 0){
			x1 = (-b + math.sqrt(m)) / 2 * a
			x2 = (-b - math.sqrt(m)) / 2 * a
			println(s"有两个解x1 = ${x1.formatted("%.2f")}, x2 = ${x2.formatted("%.2f")}")
		} else if (m == 0) {
			x1 = (-b + math.sqrt(m)) / 2 * a
			println(s"有一个解 x1 = $x1")
		} else {
			println("无解")
		}
	}
}
