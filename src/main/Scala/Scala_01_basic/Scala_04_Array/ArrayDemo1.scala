package Scala_01_basic.Scala_04_Array

object ArrayDemo1 {
  def main(args: Array[String]): Unit = {
    //声明一个定长数组
    val nums = new Array[Int](10)
    //10的元素的整数数组，所有元素初始化为0

    val str = new Array[String](10)
    //10个元素的字符串数组，所有元素初始化为null

    val s = Array("Hello","World")

    s(0) = "Goodbye"
  }
}
