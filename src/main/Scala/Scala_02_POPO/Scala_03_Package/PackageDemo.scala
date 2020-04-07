package Scala_02_POPO.Scala_03_Package //包
/**
  * Scala包的特点概述
  *     基本语法
  *         package 包名
  *     Scala包的三大作用
  *         1）区分相同名字的类
  *         2）当类很多时，可以很好的管理类
  *         3）控制访问范围
  *         4）可以对类的功能进行扩展
  * Scala包的命名
  *     命名规则
  *         只能包含数字、字母、下划线、小圆点，但不能用数字开头，也不要使用关键字
  * */
object PackageDemo {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.play("在吃饭")
  }
  class Person{ //表示在当前包下创建类Person
    val name = "Nick"

    def play(message:String) = {
      println(this.name + " " + message)
    }

  }
}
