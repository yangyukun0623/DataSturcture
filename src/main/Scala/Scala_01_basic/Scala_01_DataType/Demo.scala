package Scala_01_basic.Scala_01_DataType

object Demo {
    def main(args: Array[String]): Unit = {
        //Scala支持的类型
        //Scala没有内置类型，从头开始设计的，具有一组代表其支持类型的类

        /**
          * val 不可变变量
          * 语法：
          *     val <Name of our variable>:<Scala type> = <Some literal>
          * 例如：
          *     val dount: Int = 5
          *
          * var 可变变量
          * 语法类似var
          * 例如：
          *     var some:String = "Dount"
          *     somr = "Vanilla"
          *
          * 延迟初始化
          * 将某些变量的初始化延迟到应用程序使用它的时候。这时候
          * 通常称为延迟初始化，需要使用lazy关键字
          *
          * lazy val dountService = "initialize some dount service"
          *
          * 注意：
          *     我们尚未制定变量类型，但是这种情况下Scala编译器知道它应该为String
          *     类型，这称为类型推断
          * */

        /**
          * Scala支持的类型
          * Scala没有内置类型，从头开始设计的，具有一组代表其支持类型的类
          *
          * */
        //整型
        val dountsBought: Int = 5
        //长整型
        val bigNUmberOfDonuts: Long = 10000000L
        //短整型
        val smallNumberOfDonuts: Short = 1
        //双精度浮点型
        val priceOfDonut: Double = 2.50
        //单精度浮点型
        val donutPrice: Float = 2.50f
        //字符串类型
        val dountStoreName: String = "allaboutscala Donut Store"
        //字节类型
        val donutByte: Byte = 0
        //字符类型
        val donutFirstLetter: Char = 'A'
        //空类型，类似void
        val nothingL: Unit = ()

        //声明一个没有初始化的变量
        //定义变量时，我们使用通配符_
//        var least: String = _
//        least = "Plain Donut"
    }
}
