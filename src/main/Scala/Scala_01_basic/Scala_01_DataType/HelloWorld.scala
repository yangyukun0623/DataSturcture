package Scala_01_basic.Scala_01_DataType

import java.util

object HelloWorld {
    /*
    * 这是一个Scala程序
    * 这是一行注释
    * */
    def main(args: Array[String]): Unit = {
        //输出Hello World
        //这是单行注释
        var list:util.ArrayList[String] = new util.ArrayList[String]()
        list.add("1")
        list.add("2")
        list.add("3")

        var set:util.Set[Integer] = new util.HashSet[Integer]()
        set.add(1)
        set.add(2)
        set.add(3)
        set.add(4)
        val value = set.iterator()
        while (value.hasNext){
            print(value.next() + " ")
        }
        var num = 1
        println(num)
        println("Hello World")
        pong(list)
    }

    def pong(list:util.ArrayList[String]) = {
        for (s <- 1 to list.size()){
            println(s)
        }
    }
}
