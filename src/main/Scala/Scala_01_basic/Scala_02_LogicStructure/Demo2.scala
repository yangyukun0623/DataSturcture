package Scala_01_basic.Scala_02_LogicStructure

object Demo2 {
    def main(args: Array[String]): Unit = {
        val s = casting('a')
        println(s)
    }

    def casting(char: Char):Int = {
        val number:Int = char
        return number
    }
}
