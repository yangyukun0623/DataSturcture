package Scala_01_basic.Scala_02_LogicStructure

object Demo1 {
  def main(args: Array[String]): Unit = {
    //���������������Ƚ�����������С������ϴ���Ǹ�
    val const1: Int = 35
    val const2: Int = 23
    if (const1 > const2)
      println(const1)
    else
      println(const2)

    println(if(const1 > const2) const1 else const2)

  }
}
