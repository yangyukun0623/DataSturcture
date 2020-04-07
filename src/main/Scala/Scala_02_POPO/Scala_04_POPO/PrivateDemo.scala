package Scala_02_POPO.Scala_04_POPO
/**
  * 封装的实现步骤
  *     1）将属性进行私有化
  *     2）提供一个公共的set方法，用于对属性判断并赋值
  *     def setXxx(参数名:类型):Unit = {
  *         //加入数据验证的业务逻辑
  *         属性 = 参数名
  *     }
  *     3）提供一个的get方法，用于获取属性的值
  *     def getXxx()[:返回类型] = {
  *         return 属性
  *     }
  *
  * Scala继承的基本语法
  *     class 子类名 extends 父类名 { 类体 }
  * */
object PrivateDemo {
  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "Nick"
    p.showInfo()

    val s = new Student
    s.name = "Click"
    s.studying()
  }

  class Person{
    var name:String = _
    var age:Int = _
    def showInfo() = {
      println("学生信息如下：")
      println("名字：" + this.name)

    }

  }

  class Student extends Person{
    def studying() = {
      //这里可以使用父类的属性
      println(this.name + "学习Scala中...")
    }


  }
}
