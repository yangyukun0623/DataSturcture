package Scala_01_basic.Scala_05_FunctionAndMethod


object FunDemo05 {
	def main(args: Array[String]): Unit = {
		//ֵ�������ڱ����д�ź���
		val num = 3.14
		val fun = math.ceil _
		//��num��Ϊ3.14��fun��Ϊceil����
		//ceil�������_��ζ����ȷʵָ��������������������������˸����ͺ���
		val d = fun(num)
		println(d)
		val array = Array(3.14, 1.42, 2.0).map(fun)
		println(array.toList)
		//���Ǹ߽׺�����������Ƕ�׵���
//		def f4() = {
//			println("Haa")
//		}
//		def f5() = {
//			f4
//		}

	}
}
