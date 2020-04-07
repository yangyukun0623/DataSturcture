package Scala_02_POPO.Scala_01_ClassAndObject

object Counter {
  class Counter{
    private var value = 0 //±ØÐë³õÊ¼»¯×Ö¶Î
    def increment() {value += 1}
    def current() = value
  }

  def main(args: Array[String]): Unit = {
    val myCount = new Counter()
    myCount.increment()
    myCount.increment()
    println(myCount.current())

    val p = new Person()
    p.age_=(11)
    println(p.age)

  }

  class Person{
    private var privateAge = 0
    def age = privateAge
    def age_= (newValue:Int): Unit ={
      if (newValue > privateAge) privateAge = newValue;
    }

  }
}
