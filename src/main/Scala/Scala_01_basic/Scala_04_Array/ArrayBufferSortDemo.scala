package Scala_01_basic.Scala_04_Array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferSortDemo {
    def main(args: Array[String]): Unit = {
        val arr = ArrayBuffer("mary","had","a","little","lamb")
        println(arr.max)
        println(arr.min)

        val b = ArrayBuffer(1,7,2,9)
        val bSorted = b.sorted
        println(bSorted)

    }
}
