package Scala_04_DataStructure.Map

import scala.collection.mutable

object MapDemo1 {
  def main(args: Array[String]): Unit = {
    Demo1()
    Update()
    iterator()
  }

  def Demo1() = {
    //����һ�����ɱ�ӳ��
    val score = Map("Alice" -> 10,"Bob" -> 3,"Cindy" -> 8)
    println(score)
    //����һ���ɱ�ӳ��
    val sc = scala.collection.mutable.Map("Alice"->10,"Bob"->3,"Cindy"->8)
    println(sc)

    //����һ����ӳ��
    val s2 = new mutable.HashMap[String,Int]
    s2.put("Alice",10)
    println(s2)

    //��ȡӳ���ֵ
    val bob = score("Bob")
    println(bob)
    val alice = score.get("Alice")
    println(alice)

    //����Ƿ����ĳ����
    val bool = if(score.contains("Bob")) score("Bob") else 0
    println(bool)
    // =>�ȼ���
    val boolScore = score.getOrElse("Bob",0)
    println(boolScore)

  }
  def Update() = {
    //����ӳ���е�ֵ
    var score = mutable.HashMap("Alice" -> 10,"Bob" -> 3,"Cindy" -> 8)
    score("Bob") = 10
    println(score)
    //���¼�"Bob"��Ӧ��ֵ
    score("Fred") = 7
    println(score)
    //�����µļ�/ֵ��ż��score
    score += ("Bob"->10,"Fred"->7)
    println(score)
    //ʹ��+=������Ӷ����ϵ
    score -= "Alice"
    println(score)
    //�Ƴ�ĳ������Ӧ��ֵ
    val newScore = score + ("Bob"->10,"Fred"->7)//���¹���ӳ��
    println(newScore)

  }


  def iterator(): Unit = {
    //����ӳ��
    val score = mutable.HashMap("Alice" -> 10,"Bob" -> 3,"Cindy" -> 8)
    val set = score.keySet
    println(set)
    for (v <- score.values) println(v)
  }
}
