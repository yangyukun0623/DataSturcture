package Scala_0n_Pratice.Scala_01_PraticeProblem

object Demo {
	def main(args: Array[String]):Unit = {
		var sum = 0
		var i = 1
		while (sum < 30 || i > 100) {
			sum += i
			i += 1
		}

		println(i)
		println(sum)
	}
}
