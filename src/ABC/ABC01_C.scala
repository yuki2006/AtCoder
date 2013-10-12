
package ABC

import scala.collection.mutable.ListBuffer

object ABC01_C extends App {
  override def main(args: Array[String]) {
    var tmp = readLine.split(" ");
    var deg = tmp(0).toInt
    var dis = tmp(1).toDouble;

    var tupleList = ListBuffer(
      (0.0, "N"), (11.25, "NNE"), (33.75, "NE"), (56.25, "ENE"),
      (78.25, "E"), (101.25, "ESE"), (123.75, "SE"),
      (146.25, "SSE"), (168.75, "S"), (191.25, "SSW"), (213.75, "SW"),
      (236.25, "WSW"), (258.75, "W"), (281.25, "WNW"), (303.75, "NW"), (326.25, "NNW"),
      (348.75, "N"))
    var W = Array(0.0, 0.3, 1.6, 3.4, 5.5, 8.0, 10.8, 13.9, 17.2,
      20.8, 24.5, 28.5, 32.7);
    var dir = "";
    var hit = false;
    for (i <- tupleList.length - 1 to 0 by -1) {
      if (!hit) {
        if (tupleList(i)._1.asInstanceOf[Double] < deg / 10) {
          for (j <- W.length - 1 to 0 by -1) {
            if (!hit) {
              var p = ((dis / 60) * 10).floor / 10;
              if (p == 0) {
                println("C 0");
                hit = true;
              } else if (W(j) < p) {
                println(tupleList(i)._2 + " " + j);
                hit = true;
              }
            }
          }
        }
      }
    }
  }

}