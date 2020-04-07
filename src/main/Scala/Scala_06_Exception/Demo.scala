package Scala_06_Exception

object Demo {
  def main(args: Array[String]): Unit = {
    try{
      val r = 10 / 0
      println(r)
    } catch {
      //˵��
      //1.��Scala��ֻ��һ��catch
      //2.��catch���ж��case��ÿ��case����ƥ��һ���쳣
      //3.=> �ؼ����ţ���ʾ�����ǶԸ��쳣�Ĵ�������
      //4.finally ����Ҫִ�е�
      case ex:ArithmeticException => {
        println("�����˳���Ϊ��������쳣")
        ex.printStackTrace()
      }
      case ex: Exception => {
        println("�������쳣")
      }
    } finally {
      //����Ҫִ�еĴ���
      println("scala finally...")
    }

    println("ok,����ִ��~~~~~~")
    test()
    f11()
  }

  //��throw�ؼ����׳�һ���쳣���������쳣����Throwable�����࣬throw���ʽ�������͵ģ�����Nothing
  def test():Nothing = {
    throw new ArithmeticException("�����쳣")
  }

  //ʹ��throws�ؼ����������쳣������ʹ�÷������������쳣
  @throws(classOf[NumberFormatException])
  def f11() = {
    "abc".toInt
  }
}
