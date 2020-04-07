package Scala_0n_Pratice.Scala_01_PraticeProblem

object Main {
	def main(args: Array[String]): Unit = {
		var count = 0
		var sum = 0
		for (x <- 9 to 100 by 9) {
			count += 1
			sum += x
		}
		println(s"sum = $sum, count = $count")
	}
}
