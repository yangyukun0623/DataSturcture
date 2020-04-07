package Scala_01_basic.Scala_05_FunctionAndMethod

import java.text.MessageFormat

object FunctionDemo4 {
    def main(args: Array[String]): Unit = {
        def decorate(str:String,left:String = "[", right:String = "]") = {
            left + str + right
        }
        println(decorate("Hello"))

        def sum(args:Int*) = {
            var result = 0
            for (arg <- args) result += arg
            result
        }
        println(sum(5,2,2))

        //val s = sum(1 to 5)    //错误
        val s = sum(1 to 5:_*)
        println(s)

        val str = MessageFormat.format("The answer to {0} is {1}","evething",42.asInstanceOf[AnyRef])
        println(str)

    }
}
