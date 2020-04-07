package Scala_02_POPO.Scala_06_trait

object TraitDemo01 {
	def main(args: Array[String]): Unit = {
		val c = new C()
		val f = new F()
		c.getConnection()
		f.getConnection()

		//�������ʵĶ��󣬶�̬����
		val t = new Trait01 {
			override def getConnection(): Unit = {
				println("��ȡmybatis����")
			}
		}
		t.getConnection()
	}
}
trait Trait01{
	//����һ���淶
	def getConnection()
}
class A {}
class B extends A {}
class C extends A with Trait01 {
	override def getConnection(): Unit = {
		println("����mysql���ݿ�")
	}
}
class D {}
class E extends D {}
class F extends D with Trait01 {
	override def getConnection(): Unit = {
		println("����oracle���ݿ�..")
	}
}