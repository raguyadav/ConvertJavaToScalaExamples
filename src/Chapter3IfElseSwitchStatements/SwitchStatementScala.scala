package Chapter3IfElseSwitchStatements

/**
 * Created by sushi on 15-07-19.
 */
object SwitchStatementScala extends App {
  def returnNumber(number: Int): Unit = {
    number match {
      case 1 =>
        println("the output is " + number)
      case 10 =>
        println("the output is " + number)
      case _ =>
        println("the default output is " + number)
    }
  }
  val number = 12
  returnNumber(number)
}
