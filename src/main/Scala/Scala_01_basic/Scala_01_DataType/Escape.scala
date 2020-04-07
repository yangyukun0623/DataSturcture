package Scala_01_basic.Scala_01_DataType
/**
  * Scala-如何转义字符并创建多行字符串
  * 1.如何转义Json String
  * 2.使用反斜杠转义引号
  * 3.使用三引号''''''转义字符
  * 4.使用stripMargin创建多行文本
  *
  * */
object Escape {
    def main(args: Array[String]): Unit = {
        //1.如何转义Json String
        println("Step 1: How to escape a Json String")
        //val donutJson: String = "{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"
        println()

        //2.使用反斜杠转义引号
        println("Step 2: Using backslash to escape quotes")
        val donutJson2: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
        println(s"donutJson2 = $donutJson2")
        println()

        //3.使用三引号''''''转义字符
        println("Step 3: Using triple quotes \"\"\" to escape character")
        val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
        println(s"donutJson3 = $donutJson3")
        println()

        //4.使用stripMargin创建多行文本
        println("Step 4: Creating multi-line text using stripMargin")
        val donutJson4:String =
            """
              |{zde
              |"donut_name":"Glazed Donut",
              |"taste_level":"Very Tasty",
              |"price":2.50
              |}
            """.stripMargin
        println(s"donutJson4 = $donutJson4")
    }
}
