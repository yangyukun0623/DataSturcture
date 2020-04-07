package Scala_01_basic.Scala_05_FunctionAndMethod

object FunDemo01 {
	def main(args: Array[String]): Unit = {
		val n1 = 10
		val n2 = 20
		val res = getRes(1, 2, '+')
		println("res = " + getRes(1, 2, ')'))
		println("res1 = " + res)
	}

	//定义方法/函数
	def getRes(n1:Int, n2:Int, oper:Char) = {
		if (oper == '+') {
			n1 + n2
		} else if (oper == '-') {
			n1 - n2
		} else {
			null
		}
	}
}
