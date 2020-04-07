package Scala_02_POPO.Scala_01_ClassAndObject

import java.util.Scanner

object SceneryDemo {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    var scenery = new Scenery
    var name = ""
    var age = 0
    do {
      print("请输入姓名：")
      name = sc.next()
      print("请输入年龄：")
      age = sc.nextInt()
      scenery.name = name
      scenery.age = age
      println(scenery.show() + "\n")
    }while (name != "n")
  }

  class Scenery{
    var name = ""
    var age:Int = 0

    def show():String = {
      var str:String = name + "的年龄为：" + age
      if (age > 18){
        str += ", 门票价格为：20元"
      } else {
        str += ", 门票免费"
      }
      str
    }
  }
}
