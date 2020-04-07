package Scala_02_POPO.Scala_01_ClassAndObject

import java.util.Scanner

object SceneryDemo {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    var scenery = new Scenery
    var name = ""
    var age = 0
    do {
      print("������������")
      name = sc.next()
      print("���������䣺")
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
      var str:String = name + "������Ϊ��" + age
      if (age > 18){
        str += ", ��Ʊ�۸�Ϊ��20Ԫ"
      } else {
        str += ", ��Ʊ���"
      }
      str
    }
  }
}
