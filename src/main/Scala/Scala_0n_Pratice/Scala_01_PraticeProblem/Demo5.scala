package Scala_0n_Pratice.Scala_01_PraticeProblem

import java.util.Scanner

/**
  * ��Ŀ��������������x,y,z���������������С�������.
  *
  * */
object Demo5 {
    def main(args: Array[String]): Unit = {
        val sc:Scanner = new Scanner(System.in)
        print("��Ҫ�Ƚϼ�����:")
        val len:Int = sc.nextInt()
        println("\n������Ҫ�Ƚϵ�����")
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
