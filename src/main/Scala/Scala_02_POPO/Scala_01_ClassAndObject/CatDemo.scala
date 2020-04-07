package Scala_02_POPO.Scala_01_ClassAndObject

import java.util.Scanner

object CatDemo {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)

    //创建一只猫
    val cat = new Cat
    //给猫的属性赋值
    //说明
    //1.cat.name = "小白" 其实不是直接访问属性，而是cat.name_$eq("小白")
    //2.cat.name 等价于 cat.name()
    cat.name = "小白"
    cat.age = 10
    cat.color = "白色"
    println("ok~")
    printf("\n小猫信息如下:%s %d %s",cat.name,cat.age,cat.color)
  }

  //定义一个类Cat
  //一个class Cat对应的字节码文件只有一个Cat.class，默认是public
  class Cat{
    //定义/声明三个属性
    //说明
    //1.当我们声明了var name:String时，在底层对应private name
    //2.同时生成两个public方法name()<=类似=>getter public name_$eq()=>setter
    var name:String = ""//给初始值
    var age:Int = _ // _表示给age一个默认值，如果Int默认0
    var color:String = _ //_给color默认值，如果String，默认就是""
  }
}
