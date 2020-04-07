package Scala_05_FileAndRe.File

import java.io.{File, PrintWriter}

object WriteData {
	def main(args: Array[String]): Unit = {
		//val source = Source.fromFile("number.txt")
		val file = new File("number.txt")
		val pw = new PrintWriter(file)
		for (x <- 1 to 20) {
			pw.println("%d \t\t %f".format(x, 1 / math.pow(2, x - 1)))
		}
		println("Íê³É~~~")
	}
}
