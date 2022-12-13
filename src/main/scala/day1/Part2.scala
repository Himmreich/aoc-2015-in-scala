package day1

import scala.io.Source
import scala.util.control.Breaks._

object Part2 {

  def main(args: Array[String]): Unit = {
    val puzzle = Source.fromFile("src/main/scala/day1/puzzle").getLines().mkString

    var floor = 0
    var basement = 0

    breakable {
      puzzle.toCharArray.foreach(c => {
        c match {
          case '(' => floor += 1
          case ')' => floor -= 1
        }
        basement += 1
        if (floor == -1) break
      })
    }
    println(basement)
  }
}
