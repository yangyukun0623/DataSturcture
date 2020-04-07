package Scala_01_basic.Scala_04_Array

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo {
  def main(args: Array[String]): Unit = {
    val b = new ArrayBuffer[Int]()
    //一个空的数组缓冲，准备存放整数
    b += 1
    println(b)
    //ArrayBuffer(1)
    //用+=在尾端添加元素
    b += (2,3,4,5)
    println(b)
    //ArrayBuffer(1,2,3,4,5)
    //在尾端添加多个元素，以括号包起来
    b ++= Array(8,13,21)
    println(b)
    //ArrayBuffer(1,2,3,4,5,8,13,21)
    //你可以用++=操作符追加任何集合
    b.trimEnd(5)
    println(b)
    //ArrayBuffer(1,2,3)
    //移除最后5个元素
    b.insert(2,6)
    println(b)
    //在下标2之前插入6
    b.remove(2)
    println(b)
    //移除第2个元素
    b.remove(0,3)
    //移除从第0个位置的三个元素
    println(b)
  }
}
