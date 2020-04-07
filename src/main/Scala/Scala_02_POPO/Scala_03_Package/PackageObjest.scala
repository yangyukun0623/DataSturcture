package Scala_02_POPO.Scala_03_Package
	package object scala{
		var name = "king"

		def sayHiv() = {
			println("package object scala sayHI")
		}
	}
	package scala {

		class Person {
			val name = "Nick"

			def play(message: String) = {
				println(this.name + " " + message)
			}
		}

		class User {
			def testUser() = {
				println("name = " + name)
				sayHiv()
			}
		}

		object PackageObject {
			def main(args: Array[String]): Unit = {
				println("name = " + name)
				name = "yy"
				sayHiv()
			}
		}

	}





































