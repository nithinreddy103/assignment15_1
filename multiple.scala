class Accenture{
  var salary1 = 10000
}

class Wipro extends Accenture{
  var salary2 = 20000
}

class Infosys extends Wipro{
  def show(){
    println("salary1 = "+salary1)
    println("salary2 = "+salary2)
  }
}

object multiple {
  def main (args: Array[String]) {
    {
      var c = new Infosys()
      c.show()

    }
  }
}
