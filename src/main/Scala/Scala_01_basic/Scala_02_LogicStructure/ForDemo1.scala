package Scala_01_basic.Scala_02_LogicStructure

object ForDemo1 {
  /**
    * Ƕ��ѭ��
    * */
  def main(args: Array[String]): Unit = {
    for (i <- 1 to(3); j <- 1 to(3)){
      println("i = " + i + ", j = " + j)
    }

    //ѭ������ֵ
    //�����������д���Ľ�����ص�һ����Vector�����У�ʹ��yield�ؼ���
    val res = for (i <- 1 to 10) yield i
    println(res)
    println("---------------")
    val result = for (i <- 1 to 10) yield {
      if (i % 2 == 0)
        i
      else
        "����ż��"
    }
    println(result)
  }
}
