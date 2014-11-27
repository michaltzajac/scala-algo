package michalz.algo.utils

import scala.io.Source

/**
 * @author mzajac
 * @since 2014.11.27
 */
object FileUtils {

  def readIntsFromFile(fileName: String): Array[Int] = {
    Source.fromFile(fileName).getLines.map(_.trim).filter(!_.isEmpty).map(_.toInt).toArray
  }
}
