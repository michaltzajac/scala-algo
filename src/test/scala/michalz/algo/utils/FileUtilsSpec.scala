package michalz.algo.utils

import org.scalatest.{Matchers, FunSuite}
import org.scalatest.matchers.Matcher

import scala.Array

/**
 * Created by michal on 26.11.14.
 */
class FileUtilsSpec extends FunSuite with Matchers {
  test("FileUtils should read array of integer from file"){
    val numbers = FileUtils.readInts("src/test/resources/michalz/algo/utils/arrayOfInts.txt")
    numbers should be (Array(1, 2, 7, 12, 4, -6))
  }
}
