package Scala_02_POPO.Scala_05_Static

object ApplyDemo01 {
	def main(args: Array[String]): Unit = {
		val list = List(1, 2, 5)
		println(list)

		val pig = new Pig("小花")
		println("pig.name = " + pig.name)

		//使用apply创建对象
		val pig2 = Pig("小黑猪") //自动  apply(pName:String)
		val pig3 = Pig() // 自动触发apply()
		println("pig2.name = " + pig2.name)
		println("pig3.name = " + pig3.name)
	}
}
class Pig(pName : String) {
	var name = pName
}
object Pig {
	//编写一个apply
	def apply(pName: String): Pig = new Pig(pName)

	def apply(): Pig = new Pig("匿名猪猪")
}