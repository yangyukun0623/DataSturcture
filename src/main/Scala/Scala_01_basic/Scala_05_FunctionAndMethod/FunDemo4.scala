package Scala_01_basic.Scala_05_FunctionAndMethod
/**
  * �߽׺������Ժ�����Ϊ�����򷵻�ֵ�ĺ����Ǹ߽׺���
  * */
object FunDemo4 {
	def main(args: Array[String]): Unit = {

		//�Ժ�����Ϊ������������
		def f1(f:(Int, Int) => Int, a:Int) = {
			println(f(1, 2) + a)
		}
		def f(a:Int, b:Int) = {
			a + b
		}
		f1(f, 3)
	}
}
