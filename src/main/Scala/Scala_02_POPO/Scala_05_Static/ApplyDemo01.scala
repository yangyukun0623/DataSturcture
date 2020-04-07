package Scala_02_POPO.Scala_05_Static

object ApplyDemo01 {
	def main(args: Array[String]): Unit = {
		val list = List(1, 2, 5)
		println(list)

		val pig = new Pig("С��")
		println("pig.name = " + pig.name)

		//ʹ��apply��������
		val pig2 = Pig("С����") //�Զ�  apply(pName:String)
		val pig3 = Pig() // �Զ�����apply()
		println("pig2.name = " + pig2.name)
		println("pig3.name = " + pig3.name)
	}
}
class Pig(pName : String) {
	var name = pName
}
object Pig {
	//��дһ��apply
	def apply(pName: String): Pig = new Pig(pName)

	def apply(): Pig = new Pig("��������")
}