package Scala_02_POPO.Scala_06_trait

object TraitDemo01 {
	def main(args: Array[String]): Unit = {
		val c = new C()
		val f = new F()
		c.getConnection()
		f.getConnection()

		//带有特质的对象，动态混入
		val t = new Trait01 {
			override def getConnection(): Unit = {
				println("获取mybatis连接")
			}
		}
		t.getConnection()
	}
}
trait Trait01{
	//定义一个规范
	def getConnection()
}
class A {}
class B extends A {}
class C extends A with Trait01 {
	override def getConnection(): Unit = {
		println("连接mysql数据库")
	}
}
class D {}
class E extends D {}
class F extends D with Trait01 {
	override def getConnection(): Unit = {
		println("连接oracle数据库..")
	}
}