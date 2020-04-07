package Scala_02_POPO.Scala_05_Static

object ChildJoinGame {
	def main(args: Array[String]): Unit = {
		//创建三个小孩
		val child0 = new Child02("白骨精")
		val child1 = new Child02("蜘蛛精")
		val child2 = new Child02("黄鼠狼精")
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
	//统计共有多少个小孩的属性
	var totalChildNum = 0
	def joinGame(child:Child02) = {
		println(s"${child.name} 小孩加入了游戏")
		//totalChildNum 加 1
		totalChildNum += 1
	}

	def showNum = {
		println(s"当前有${totalChildNum}小孩玩游戏")
	}
}