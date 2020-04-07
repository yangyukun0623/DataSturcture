package Scala_01_basic.Scala_05_FunctionAndMethod

object Fundemo04 {
	def main(args: Array[String]): Unit = {
		//以函数作为函数返回值
		def f1(a:Int, b:Int) = {
			def f2(x: Int) = {
				a + b + x
			}
			f2 _
		}
		println(f1(1, 2)(4))
	}
}
