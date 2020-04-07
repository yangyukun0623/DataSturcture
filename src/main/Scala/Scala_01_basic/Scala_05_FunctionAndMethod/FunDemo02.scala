package Scala_01_basic.Scala_05_FunctionAndMethod

object FunDemo02 {
	def main(args: Array[String]): Unit = {
		val tiger = new Tiger
		val tiger2 = test01(10, tiger)
		println(tiger2.name)
		println(tiger.name)
		println(tiger.hashCode() + " " + tiger2.hashCode())
	}
	def test01(n1:Int, tiger:Tiger) = {
		println("n1 = " + n1)
		tiger.name = "jack"
		tiger
	}
}
class Tiger{
	var name = ""
}
