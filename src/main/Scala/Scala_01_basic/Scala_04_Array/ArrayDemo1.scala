package Scala_01_basic.Scala_04_Array

object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    //����һ����������
    val nums = new Array[Int](10)
    //10��Ԫ�ص��������飬����Ԫ�س�ʼ��Ϊ0

    val str = new Array[String](10)
    //10��Ԫ�ص��ַ������飬����Ԫ�س�ʼ��Ϊnull

    val s = Array("Hello","World")

    s(0) = "Goodbye"
  }
}
