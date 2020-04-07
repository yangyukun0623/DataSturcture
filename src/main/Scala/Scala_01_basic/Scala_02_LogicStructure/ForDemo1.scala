package Scala_01_basic.Scala_02_LogicStructure

object ForDemo1 {
  /**
    * 嵌套循环
    * */
  def main(args: Array[String]): Unit = {
    for (i <- 1 to(3); j <- 1 to(3)){
      println("i = " + i + ", j = " + j)
    }

    //循环返回值
    //将遍历过程中处理的结果返回到一个新Vector集合中，使用yield关键字
    val res = for (i <- 1 to 10) yield i
    println(res)
    println("---------------")
    val result = for (i <- 1 to 10) yield {
      if (i % 2 == 0)
        i
      else
        "不是偶数"
    }
    println(result)
  }
}
