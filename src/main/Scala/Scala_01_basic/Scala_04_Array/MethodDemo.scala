package Scala_01_basic.Scala_04_Array

object MethodDemo {
  def main(args: Array[String]): Unit = {
    /**
      * val��䶨�庯����def���巽��
      * �����������Ĳ���
      * ��������һ�������Ķ���Scala�ĺ������Ǽ̳���Trait����Ķ���
      * */
    def m(x: Int,y: Int) = x + y
    val f = (x: Int) => x + 3
    println(m(2,3))
    println(f(3))
    println("Returned Value: " + addInt(5,7))
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = a + b
    return sum
  }
}
