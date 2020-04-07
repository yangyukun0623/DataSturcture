package Scala_04_DataStructure.Map

import scala.collection.mutable

object MapDemo1 {
  def main(args: Array[String]): Unit = {
    Demo1()
    Update()
    iterator()
  }

  def Demo1() = {
    //构造一个不可变映射
    val score = Map("Alice" -> 10,"Bob" -> 3,"Cindy" -> 8)
    println(score)
    //构造一个可变映射
    val sc = scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Cindy"->8)
    println(sc)

    //构造一个空映射
    val s2 = new mutable.HashMap[String,Int]
    s2.put("Alice",10)
    println(s2)

    //获取映射的值
    val bob = score("Bob")
    println(bob)
    val alice = score.get("Alice")
    println(alice)

    //检查是否包含某个键
    val bool = if(score.contains("Bob")) score("Bob") else 0
    println(bool)
    // =>等价于
    val boolScore = score.getOrElse("Bob",0)
    println(boolScore)

  }
  def Update() = {
    //更新映射中的值
    var score = mutable.HashMap("Alice" -> 10,"Bob" -> 3,"Cindy" -> 8)
    score("Bob") = 10
    println(score)
    //更新键"Bob"对应的值
    score("Fred") = 7
    println(score)
    //增加新的键/值对偶到score
    score += ("Bob"->10,"Fred"->7)
    println(score)
    //使用+=操作添加多个关系
    score -= "Alice"
    println(score)
    //移除某个键对应的值
    val newScore = score + ("Bob"->10,"Fred"->7)//更新过的映射
    println(newScore)

  }


  def iterator(): Unit = {
    //迭代映射
    val score = mutable.HashMap("Alice" -> 10,"Bob" -> 3,"Cindy" -> 8)
    val set = score.keySet
    println(set)
    for (v <- score.values) println(v)
  }
}
