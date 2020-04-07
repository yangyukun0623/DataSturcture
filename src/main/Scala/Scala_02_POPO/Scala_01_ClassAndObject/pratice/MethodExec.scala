package Scala_02_POPO.Scala_01_ClassAndObject.pratice

class MethodExec(val width: Double, val heigh: Double) {
	def prints() = {
		for(i <- 1 to 10; j <- 1 to 8) {
			print("*")
			if (j % 8 == 0) println()
		}
	}

	def ares() = {
		width * heigh
	}
}

object MethodExec {
	def main(args: Array[String]): Unit = {
		val m = new MethodExec(3.0, 3.14159)
		m.prints()
		println(f"${m.ares()}%.2f")
	}
}
