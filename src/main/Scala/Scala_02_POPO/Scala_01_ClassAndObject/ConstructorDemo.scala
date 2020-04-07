package Scala_02_POPO.Scala_01_ClassAndObject

object ConstructorDemo {
  /**
    * Scala构造器的基本语法
    * class 类名(形参类名){ //主构造器
    *     //类体
    *     def this(形参列表){ //辅助构造器
    *     }
    *
    *     def this(形参列表){ //辅助构造器可以有多个
    *     }
    * }
    *
    * //1.辅助构造器：函数名为this，可以有多个，编译器通过不同参数来区分
    *
    * Scala构造器注意事项和细节
    * 1）Scala构造器作用是完成对新对象的初始化，构造器没有返回值。
    * 2）主构造器的声明直接放置于类名之后[反编译]
    * 3）主构造器会执行类定义中的所有语句
    * 4）如果主构造器无参数，小括号可以省略。构建对象时调用的构造方法的小括号也可以省略
    * 5）辅助构造器名称为this，多个辅助构造器通过不同参数列表进行区分
    * */
  def main(args: Array[String]): Unit = {

  }

  class Person(inName:String,intAge:Int){
    var name:String = inName
    var age:Int = intAge
    age += 10
    println("~~~~~~~~~~")

    override def toString: String = {
      "name=" + this.name + "\t age=" + this.age
    }

    println("ok~~~~~~~~")
    println("age=" + age)

    def this(name:String){
      //辅助构造器，必须在第一行显示调用主构造器
      this("jack",10)
      //this
      this.name = name //重新赋值
    }
  }
}
