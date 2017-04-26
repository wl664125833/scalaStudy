package test
case class Class1(param1: String, param2: String)

case class Class2(param1: String)
object Case {
  //Scala中的match(模式匹配)
  def main(args: Array[String]) {
    //通过模式匹配进行条件判断
    val test1: String = "1"
    val result1 = test1 match {
      case "1" => {
        "one"
      }
      case "2" => "two"
      case _ => "other"
    }
    println(result1)

    //通过模式匹配进行条件判断，可自定义条件
    val test2: Int = 1;
    val result2 = test2 match {
      case i if i + 1 == 2 => "one"
      case i if i + 1 == 3 => "tow"
      case _ => "error"
    }
    println(result2)

    //通过模式匹配进行类型条件判断
    val t3 = 1
    println(Test3(t3))

    //通过模式匹配进行类型条件判断
    val t4 = "1"
    println(Test3((t4)))

    //通过模式匹配进行类的判断与执行
    val test5 = Class1("1", "2")
    ClassMatch(test5)

    val test6 = Class2("3")
    ClassMatch(test6)
  }
  
  def ClassMatch(classTest: Any): Unit = {
    classTest match {
      case Class1(param1, param2) => {
        println("Class1:" + param1 + "_" + param2)
      }
      case Class2(param1) => {
        println("Class2:" + param1)
      }
      case _ => println("error")
    }
  }

  def Test3(data: Any): String = {
    data match {
      case x: Int => "Int"
      case x: String => "String"
      case _ => "unkown"
    }
  }
}