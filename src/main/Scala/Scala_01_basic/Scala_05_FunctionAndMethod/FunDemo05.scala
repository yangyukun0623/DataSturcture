package Scala_01_basic.Scala_05_FunctionAndMethod


object FunDemo05 {
	def main(args: Array[String]): Unit = {
		//值函数，在变量中存放函数
		val num = 3.14
		val fun = math.ceil _
		//将num设为3.14，fun设为ceil函数
		//ceil函数后的_意味着你确实指的是这个函数，而不是碰巧忘了给他送函数
		val d = fun(num)
		println(d)
		val array = Array(3.14, 1.42, 2.0).map(fun)
		println(array.toList)
		//不是高阶函数，函数的嵌套调用
//		def f4() = {
//			println("Haa")
//		}
//		def f5() = {
//			f4
//		}

	}
}
