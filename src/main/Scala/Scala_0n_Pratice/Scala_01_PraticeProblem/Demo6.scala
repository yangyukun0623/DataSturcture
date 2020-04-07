package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * 题目：输出特殊图案，请在c环境中运行，看一看，very?beautiful!
  * */
object Demo6 {
    def main(args: Array[String]): Unit = {
        var a:Char = 176.toChar
        var b:Char = 219.toChar
        print(b + a + a + a + b + "\n")
        print(a + b + a + b + a + "\n")
        print(a + a + b + a + a + "\n")
        print(a + b + a + b + a + "\n")
        print(b + a + a + a + b + "\n")
    }
}
