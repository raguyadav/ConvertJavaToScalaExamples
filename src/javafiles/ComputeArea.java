package javafiles;

import scala.ComputeAreaScala;

/**
 * Created by sushi on 15-06-03.
 */
public class ComputeArea {

    public static void main(String[] args) {
        double radius = 5;
        final double PI = 3.14159;
        double area = radius * radius * PI;
        System.out.println("the area is " + area);

        int i = 0;
        int p = 0;
        double k = 100.0;
        int j = i + 1;
        System.out.println("j is " + j + " and k is " + k + "p is " + p);

        // Here we will utilize a Scala object from a Java Class
        // The scala student class is a case class.
        // lets use the scala student class
        ComputeAreaScala.ScalaStudent scalaStudent = new ComputeAreaScala.ScalaStudent(13, "SushiScala");
        System.out.println(scalaStudent.studentId());
        System.out.println(scalaStudent.studentName());
    }
}