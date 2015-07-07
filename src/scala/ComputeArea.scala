package scala
import javafiles.Student

/**
 * Created by sushi on 15-06-03.
 */
object ComputeAreaScala extends App {
  
  val radius = 5
  val PI = 3.14159
  val area = radius * radius * PI
  println ("the radius is " + area)

  val i = 0
  val p  = 0
  val k  = 100.0
  val j  = i + 1
  System.out.println("j is " + j + " and k is " + k + " p is " + p)

  // WE will call a Java class from a scala class.
  // THe java class is called Student

  val sushi = new Student(12,"Norman")
  println(sushi.getStudentId)
  println(sushi.getStudentName)
  sushi.setStudentId(13)
  println(sushi.getStudentId)

  // declaring a scala student class which will used by our java class.
  case class ScalaStudent(studentId: Int,studentName: String)
}
