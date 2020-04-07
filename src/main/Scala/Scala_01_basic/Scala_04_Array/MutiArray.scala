package Scala_01_basic.Scala_04_Array

object MutiArray {
    def main(args: Array[String]): Unit = {
        val matrix = Array.ofDim[Double](3,4)
        matrix(1)(2) = 42.toDouble

        val traingle = new Array[Array[Int]](10)
        for (i <- 0 until traingle.length){
            traingle(i) = new Array[Int](i + 1)
        }
    }
}
