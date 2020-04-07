package Scala_01_basic.Scala_05_FunctionAndMethod

object FunDemo06 {
	def main(args: Array[String]): Unit = {
		val triple = (x:Double) => 3 * x
		Array(3.14, 1.42, 2.0).map((x:Double) => 3 * x).foreach(println _)
	}
}
