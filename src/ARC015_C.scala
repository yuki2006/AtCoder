import scala.swing.Table
import scala.collection.mutable.ListBuffer

object ARC015_C extends App {
  override def main(args: Array[String]): Unit = {
    var N = readInt;
    var map = ListBuffer.empty[String];
    var table = Array.ofDim[Int](N + 1, N + 1);

    for (i <- 1 to N) {

      var tmp = readLine.split(" ")
      if (!map.contains(tmp(0))) {
        map.+=(tmp(0))
      }
      if (!map.contains(tmp(2))) {
        map.+=(tmp(2))
      }
      var ix = map.indexOf(tmp(0))
      var iy = map.indexOf(tmp(2))
      table(ix)(iy) = tmp(1).toInt
      table(iy)(ix) = tmp(1).toInt

    }
    val init = 0
    for (i <- 0 to N - 1) {
      table(i)(i) = init
    }

    for (i <- 0 to N - 1) {
      for (j <- 0 to N - 1) {
        println("" + table(i)(j) + i + ":" + j)
      }
    }

    for (k <- 0 to N - 1) {
      for (i <- 0 to N - 1) {
        for (j <- 0 to N - 1) {
          if (i != j && table(i)(j) == 0) {
            table(j)(i) = table(i)(k) * table(k)(j)
            table(i)(j) = table(j)(i);
            println(i + ":" + j + ":" + k + ":" + table(i)(j))
          }
        }
      }
    }
    var max = 0;
    for (i <- 0 to N - 1) {
      for (j <- 0 to N - 1) {
        max = Math.max(table(i)(j), max);
      }
    }
    println(max)
  }
}