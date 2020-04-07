package Scala_06_Exception

object Demo {
  def main(args: Array[String]): Unit = {
    try{
      val r = 10 / 0
      println(r)
    } catch {
      //说明
      //1.在Scala中只有一个catch
      //2.在catch中有多个case，每个case可以匹配一种异常
      //3.=> 关键符号，表示后面是对该异常的处理代码块
      //4.finally 最终要执行的
      case ex:ArithmeticException => {
        println("捕获了除数为零的算数异常")
        ex.printStackTrace()
      }
      case ex: Exception => {
        println("捕获了异常")
      }
    } finally {
      //最终要执行的代码
      println("scala finally...")
    }

    println("ok,继续执行~~~~~~")
    test()
    f11()
  }

  //用throw关键字抛出一个异常对象，所有异常都是Throwable的子类，throw表达式是有类型的，就是Nothing
  def test():Nothing = {
    throw new ArithmeticException("算术异常")
  }

  //使用throws关键字来声明异常，可以使用方法定义声明异常
  @throws(classOf[NumberFormatException])
  def f11() = {
    "abc".toInt
  }
}
