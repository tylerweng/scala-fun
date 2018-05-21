package hello

object CallByName {
  def main(args: Array[String]) {
    delayed(time())
  }

  def time(): Long = {
    println("Getting time in nano seconds")
    System.nanoTime
  }
  def delayed( t: => Long ): Unit = {
    println("In delayed method")
    println("Param: " + t)
  }
}