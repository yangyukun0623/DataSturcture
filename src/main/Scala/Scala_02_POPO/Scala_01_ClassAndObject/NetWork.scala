package Scala_02_POPO.Scala_01_ClassAndObject

import scala.collection.mutable.ArrayBuffer

class NetWork {
    class Member(val name:String){
        val contacts = new ArrayBuffer[Member]
    }

    private val members = new ArrayBuffer[Member]

    def join(name:String) = {
        val m = new Member(name)
        members += m
        m
    }


}
