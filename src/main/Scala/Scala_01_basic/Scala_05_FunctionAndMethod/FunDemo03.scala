package Scala_01_basic.Scala_05_FunctionAndMethod

object FunDemo03 {
	def main(args: Array[String]): Unit = {
		//Ĭ�ϲ���
		println(sayOk("mary"))
		println(sayOk())

		getConnection(add = "localhost", 3306, "root", "123456")
	}
	def sayOk(name: String = "jack") = {
		name + " ok!"
	}

	//��������
	def getConnection(add:String = "localhost", port:Int = 3306, username:String = "root",
	                  password:String = "root") = {
		println("add = " + add)
		println("port = " + add)
		println("user = " + username)
		println("password = " + password)
	}
}
