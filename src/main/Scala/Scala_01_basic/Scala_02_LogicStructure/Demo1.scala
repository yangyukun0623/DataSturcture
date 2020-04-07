package Scala_01_basic.Scala_02_LogicStructure

object Demo1 {
  def main(args: Array[String]): Unit = {
    //声明两个常量，比较两个常量大小并输出较大的那个
    val const1: Int = 35
    val const2: Int = 23
    if (const1 > const2)
      println(const1)
    else
      println(const2)

    println(if(const1 > const2) const1 else const2)

  }
}
