package Scala_01_basic.Scala_04_Array

object ArraySortDemo {
    def main(args: Array[String]): Unit = {
        //数组排序
        val array = Array(1,7,2,9,3,8)
        scala.util.Sorting.quickSort(array)
        println(toString(array))
    }

    def toString(args:Array[Int]): String = {
        var str = "("
        for (x <- 0 until args.length - 1){
            str += args(x).toString + ","
        }
        str += args(args.length - 1) + ")"
        str
    }
}
