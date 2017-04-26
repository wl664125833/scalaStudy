package test

object WhyAlwaysMe {
  var flag: Boolean = true  
  def useOrNotUse(x: Int, y: => Int) = {  
    flag match{  
      case true => x  
      case false => x + y  
    }  
  }  
  def main(args: Array[String]) =   
  {  
    println(useOrNotUse(1, 2))  
    flag = false  
    println(useOrNotUse(1, 2))  
  }  
}