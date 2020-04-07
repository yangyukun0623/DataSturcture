package Scala_01_basic.Scala_04_Array

import java.util.Scanner

import scala.util.Random

object Demo1 {
    def Demo1() = {
        val n:Int = new Scanner(System.in).nextInt()
        val b = Array.ofDim[Int](n,n)
        for (x <- 0 until(n)){
            for (y <- 0 until(n)){
                b(x)(y) = Random.nextInt(n)
            }
        }
        show(b)

    }
    def show(args:Array[Array[Int]]) = {
        for (x <- 0 until args.length){
            for (y <- 0 until args(x).length){
                print(args(x)(y) + " ")
            }
            println()
        }
    }


}
















