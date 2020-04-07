package Scala_04_DataStructure.Map

import scala.collection.{immutable, mutable}

object MapDemo2 {
    def main(args: Array[String]): Unit = {
        var score = mutable.HashMap("Alice" -> 10,"Bob" -> 3,"Cindy" -> 8)
        for (v <- score.keySet){
            println(v + " -> " + score(v))
        }
        println("--------")

        val s1 = immutable.SortedMap("Alice"->10,"Field"->7,"Bob"->3,"Cindy"->8)
        println(s1)


    }
}
