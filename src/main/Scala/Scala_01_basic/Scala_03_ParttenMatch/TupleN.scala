package Scala_01_basic.Scala_03_ParttenMatch
/**
  * 使用元祖（模式匹配）
  * 1.使用Tuple2存储2个数据点
  * 2.访问元组中的每个元素
  * 3.使用TupleN类存储两个以上的数据点
  * 4.如何在元组上使用模式匹配
  * 5.创建元组的快捷方式
  * */
object TupleN {
  def main(args: Array[String]): Unit = {
    //1.使用Tuple2存储2个数据点
    println("Step 1: Using Tuple2 to store 2 data points")
    val glazedDonutTuple = Tuple2("Glazed Donut","Very Tasty")
    println(s"Glazed Donut with 2 data point = $glazedDonutTuple")

    //2.访问元组中的每个元素
    println("\nStep 2: Access each element in tuple")
    val donutType = glazedDonutTuple._1
    val donutTasteLevel = glazedDonutTuple._2
    println(s"$donutType taste level is $donutTasteLevel")

    //3.使用TupleN类存储两个以上的数据点
    println("\nStep 3: Using TupleN classes to store more than 2 data points")
    val glazedDonut = Tuple3("Glazed Donut","Very Tasty",2.50)
    println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and it's price is ${glazedDonut._3}")

    //4.如何在元组上使用模式匹配
    println("\nStep 4: How to use pattern matching on Tuples")
    val strawberryDonut = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
    val plainDonut = Tuple3("Plain Donut", "Tasty", 2)
    val donutList = List(glazedDonut,strawberryDonut,plainDonut)
    val priceOfPlainDonut = donutList.foreach {
      tuple => {
        tuple match {
          case ("Plain Donut",taste,price) => println(s"Donut type = Plain Donut, price = $price")
          case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
          case _ => None
        }
      }
    }

    //5.创建元组的快捷方式
    println("\nStep 5: Shortcut for creating Tuples")
    val chocolateDonut = ("Chocolate Donut", "Very Tasty", 3.0)
    println(s"Chocolate donut taste level = ${chocolateDonut._2}, price = ${chocolateDonut._3}")

    println("\nTip 1: A more elegant pattern matching within foreach function")
    donutList.foreach {
      case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
      case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
      case _ => None
    }
  }
}
