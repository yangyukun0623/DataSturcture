package Scala_01_basic.Scala_02_LogicStructure

object WhileDemo1 {
    def main(args: Array[String]): Unit = {
        var n = 1
        var r = 3
        while (n > 0) { r = r * n; n -= 1}
        println("n = " + n + ", r = " + r)
        val range = 1 to 10
        for (x <- range){
            print(x + " ")
        }
        println()
        for (y <- "Hello"){
            print(y + " ")
        }
        println()
        var sum = 0
        for (ch <- "Hello") sum += ch
        println(sum)
    }
}
