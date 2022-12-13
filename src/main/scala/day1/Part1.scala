 package day1

import scala.io.Source

object Part1 {

  def main(args: Array[String]): Unit = {
    val puzzle = Source.fromFile("src/main/scala/day1/puzzle").getLines().mkString

    var floor = 0

    puzzle.toCharArray.foreach {
      case '(' => floor += 1
      case ')' => floor -= 1
    }
    println(floor)
  }
}
