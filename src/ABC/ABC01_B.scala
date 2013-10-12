
package ABC

object ABC01_B extends App {
  var m = readInt;
  var result: String = "00";
  if (100 <= m && m <= 5000) {
    result ="%02d".format( (m / 100))
  } else if (6000 <= m && m <= 30000) {
    result = ((m / 1000) + 50).toString
  } else if (35000 <= m && m <= 70000) {
    result = (((m / 1000) - 30).toDouble / 5 + 80).toString
  }else if (70000 < m ) {
    result = 89.toString;
  }
  println(result);

}