package Scala_0n_Pratice.Scala_01_PraticeProblem

import java.util.Scanner

/**
  * 题目：输入三个整数x,y,z，请把这三个数由小到大输出.
  *
  * */
object Demo5 {
    def main(args: Array[String]): Unit = {
        val sc:Scanner = new Scanner(System.in)
        print("需要比较几个数:")
        val len:Int = sc.nextInt()
        println("\n请输入要比较的数：")
        var array:Array[Int] = new Array[Int](len)
        for (x <- array.indices){
            array(x) = sc.nextInt()
        }

        array = bubbleSort(array)
        for (x <- 0 until(array.length - 1)){
            print(array(x) + " < ")
        }
        println(array(array.length - 1))
    }

    def bubbleSort(array: Array[Int]):Array[Int] = {
        for(x <- 0 until array.length - 1){
            for (y <- x + 1 until array.length){
                if(array(x) > array(y)){
                    val temp = array(x)
                    array(x) = array(y)
                    array(y) = temp
                }
            }
        }
        array
    }
}
