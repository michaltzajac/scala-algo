package michalz.algo.utils

import scala.io.Source

/**
 * Created by michal on 26.11.14.
 */
object FileUtils {

  def readInts(fileName: String) = {
    Source.fromFile(fileName).getLines().map(_.trim.toInt).toArray
  }
}
