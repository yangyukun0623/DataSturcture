package Scala_02_POPO.Scala_03_Package //��
/**
  * Scala�����ص����
  *     �����﷨
  *         package ����
  *     Scala������������
  *         1��������ͬ���ֵ���
  *         2������ܶ�ʱ�����ԺܺõĹ�����
  *         3�����Ʒ��ʷ�Χ
  *         4�����Զ���Ĺ��ܽ�����չ
  * Scala��������
  *     ��������
  *         ֻ�ܰ������֡���ĸ���»��ߡ�СԲ�㣬�����������ֿ�ͷ��Ҳ��Ҫʹ�ùؼ���
  * */
object PackageDemo {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.play("�ڳԷ�")
  }
  class Person{ //��ʾ�ڵ�ǰ���´�����Person
    val name = "Nick"

    def play(message:String) = {
      println(this.name + " " + message)
    }

  }
}
