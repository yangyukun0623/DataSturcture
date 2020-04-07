package Scala_01_basic.Scala_01_DataType

object BitDemo {
    def main(args: Array[String]): Unit = {
        val a:Int = 2
        val b:Int = 2 << 2
        val c:Int = 16 >> 2
        println(dec(a))
        println(b)
        println(dec(b))
        println(c)
        println(dec(c))
    }

    def dec(num:Int):Int = {
        var n:Int = num
        var str:String = ""
        while(n != 0){
            str += n % 2
            n = n / 2
        }
        str.reverse.toInt
    }
}
