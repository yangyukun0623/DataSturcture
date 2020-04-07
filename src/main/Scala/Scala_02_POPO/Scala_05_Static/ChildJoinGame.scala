package Scala_02_POPO.Scala_05_Static

object ChildJoinGame {
	def main(args: Array[String]): Unit = {
		//��������С��
		val child0 = new Child02("�׹Ǿ�")
		val child1 = new Child02("֩�뾫")
		val child2 = new Child02("�����Ǿ�")
		Child02.joinGame(child0)
		Child02.joinGame(child1)
		Child02.joinGame(child2)
		Child02.showNum
	}
}
class Child02(cName : String) {
	var name = cName
}
object Child02 {
	//ͳ�ƹ��ж��ٸ�С��������
	var totalChildNum = 0
	def joinGame(child:Child02) = {
		println(s"${child.name} С����������Ϸ")
		//totalChildNum �� 1
		totalChildNum += 1
	}

	def showNum = {
		println(s"��ǰ��${totalChildNum}С������Ϸ")
	}
}