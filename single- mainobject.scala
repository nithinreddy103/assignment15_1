
class Employer{
  var salary:Float = 32000
}

class Programmer extends Employer{
  var bonus:Int = 15000
  println("Salary = "+salary)
  println("Variable pay = "+bonus)
}

object MainObject{
  def main(args:Array[String]){
    new Programmer()
  }
}
