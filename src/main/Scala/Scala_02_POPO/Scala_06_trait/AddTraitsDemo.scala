package Scala_02_POPO.Scala_06_trait

object AddTraitsDemo {
	def main(args: Array[String]): Unit = {
		val mysql = new MySQL4 with DB4 with File4
		println(mysql)

		mysql.insert(100)
	}
}
trait Operate4 {
	println("Operate4...")
	def insert(id:Int)  //抽象方法
}
trait Data4 extends Operate4 {
	println("Data4")

	override def insert(id: Int): Unit = {
		println("插入数据 = " + id)
	}
}
trait DB4 extends Data4 {
	println("DB4")

	override def insert(id: Int): Unit = {
		println("向数据库")
		super.insert(id)
	}
}
trait File4 extends Data4 {
	println("File4")

	override def insert(id: Int): Unit = {
		println("向文件")
		super.insert(id)
	}
}
class MySQL4 {} //普通类