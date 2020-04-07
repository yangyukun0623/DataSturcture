package Scala_01_basic.Scala_04_Array

object MethodDemo {
  def main(args: Array[String]): Unit = {
    /**
      * val语句定义函数，def定义方法
      * 方法是组成类的部分
      * 函数则是一个完整的对象，Scala的函数就是继承了Trait的类的对象
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
