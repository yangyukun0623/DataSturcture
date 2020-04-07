package Scala_04_DataStructure.Array

import scala.collection.mutable.ArrayBuffer

object ArrayDemo01 {
	def main(args: Array[String]): Unit = {
		//1.使用的是 object Array 的apply方法
		//2.直接初始化数组
		val t1 = Array(1, 2)
		val t2 = Array(3, 4)
		val res = t1.zip(t2)
		for (x <- res) {
			println(x)
		}
		println("-------")

		val t = (1, 3.14, "Fred")
		val (first, second, _) = t
		println(t.toString())
		println(second)


		println(getGoodsPrice("book"))
		println(getGoodsPrice("pen"))
		println(getGoodsPrice("sticker"))
		println(getGoodsPrice("sock"))
		println("-----------")

		println(Array(1,7,2,9).sum)
		println(Array(1,7,2,9).sorted.toList)

		println("-----------------")

		val b = ArrayBuffer[Int]()
		b += (1,2,3,4,5)
		println(b)
		b.trimEnd(3)
		println(b)
	}

	def getGoodsPrice(goods:String) = {
		val prices = Map("book" -> 5, "pen" -> 2, "sticker" -> 1)
		prices.getOrElse(goods, 0)
	}
}
