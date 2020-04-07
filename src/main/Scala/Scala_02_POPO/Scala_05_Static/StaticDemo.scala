package Scala_02_POPO.Scala_05_Static


object StaticDemo {
	def main(args: Array[String]): Unit = {
		println(ScalaPerson.sex)
		ScalaPerson.sayHi()
	}
}
//伴生类
class ScalaPerson {
	var name : String = _
}

//伴生对象
object ScalaPerson {
	var sex = true
	def sayHi() = {
		println("object ScalaPerson sayHi~~")
	}
}