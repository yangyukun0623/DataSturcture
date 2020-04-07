package Scala_01_basic.Scala_02_LogicStructure

object ForDemo2 {
	def main(args: Array[String]): Unit = {
		//循环守卫
		//循环守卫，即循环保护式（也称条件判断式， 守卫）
		//保护式为true则进入循环体内部， 为false则跳过，类似于continue
		for (i <- 1 until 10 if i != 2) {
			print(i + ", ")
		}
		println("\n--------------------")

		//引入变量
		for (i <- 1 to 6; j = 4 - i) {
			println(s"i = $i, j = $j")
		}
		println("\n--------------------")

		//嵌套循环
		for (i <- 1 until 10; j <- 1 to i) {
			print(f"$j%2d *$i%2d = ${i * j}%-2d ")
			if (i == j) println()
		}
		println("\n--------------------")
		//循环返回值
//		var res = for (i <- 1 to 10) yield i
//		println(res)

		val res = for (i <- 1 to 10) yield {
			if (i % 2 == 0) {
				i
			} else {
				"不是偶数"
			}
		}
		println(res)
		println("\n--------------------")

		//使用花括号代替小括号
		for {
			i <- 1 to 6
			j = i * 2
		} {
			println(s"i = $i, j = $j")
		}
		println("\n--------------------")

		//打印1~100之间所有是9的倍数的整数的个数及总和
		var count = 0
		var sum = 0
		for (i <- 9 to 100 by 9) {
			count += 1
			sum += i
		}
		println(s"count = $count, sum = $sum")
		println("\n--------------------")

		//统计1~200之间能被5整除但不能被3整除的个数
		count = 0
		for (i <- 1 to 200 if i % 5 == 0 && i % 3 != 0) {
			count += 1
		}
		println(s"count = $count")


	}


}
