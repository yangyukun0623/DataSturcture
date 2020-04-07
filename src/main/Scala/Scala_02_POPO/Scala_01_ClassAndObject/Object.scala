package Scala_02_POPO.Scala_01_ClassAndObject

import scala.beans.BeanProperty

object Object {
  class Counter{
    /**
      * Scala允许你将访问权赋予指定的类。private[类名]修饰符可以定义仅有
      * 指定类的方法可以访问给定的字段。这里的类名必须是当前定义的类，或者
      * 包含该类的外部类
      * */
    private[this] var v = 0 //类似于某个对象.v这样的访问将不被允许

    private var value = 0
    def increment() { value += 1}
    def isLess(other:Counter) = value > other.value

  }

  /**
    * 将Scala字段标注为@BeanProperty，自动生成这样的方法
    * */
  class Person{

    @BeanProperty var name:String = _
    //将会生成四个方法
    //1.name:String
    //2.name_=(newValue:String):Unit
    //3.getName():String
    //4.setName(newValue:String):Unit
  }
}
