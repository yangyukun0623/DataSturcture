package Scala_01_basic.Scala_05_FunctionAndMethod
/**
  * 高阶函数：以函数作为参数或返回值的函数是高阶函数
  * */
object FunDemo4 {
	def main(args: Array[String]): Unit = {

		//以函数作为函数参数传入
		def f1(f:(Int, Int) => Int, a:Int) = {
			println(f(1, 2) + a)
		}
		def f(a:Int, b:Int) = {
			a + b
		}
		f1(f, 3)
	}
}
