package Scala_02_POPO.Scala_01_ClassAndObject

object Constructor {

  class Perons{

    /*
    * 如果一个类没有显示定义主构造器则自动
    * 拥有一个无参构造器
    * */
    private var name = ""
    private var age = 0

    def this(name:String){ //辅助构造器
      this()   //调用主构造器
      this.name = name
    }

    def this(name:String, age:Int){ //另一个辅助构造器
      this(name)  //抵用前一个辅助构造器
      this.age = age
    }


    /**
      * 可以三种方式创建对象
      * */
    def main(args: Array[String]): Unit = {
      val p1 = new Perons  //主构造器
      val p2 = new Perons("Fred")  //第一个辅助构造器
      val p3 = new Perons("Fred",42) //第二个辅助构造器

      //实例Scala源文件以外的类
      val chatter = new NetWork
      val myFace = new NetWork

      val fred = chatter.join("Fred")
      val wilma = chatter.join("Wilma")
      fred.contacts += wilma
      val barney = myFace.join("Barney")
      //fred.contacts += barney


    }
  }
}
