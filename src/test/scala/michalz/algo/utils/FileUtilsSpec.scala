package michalz.algo.utils

import org.scalatest.{Matchers, FunSuite, FunSpec}

/**
 * @author mzajac
 * @since 2014.11.27
 */
class FileUtilsSpec extends FunSuite with Matchers {
  
  test("FileUtils should read array of ints from file") {
    val intArray: Array[Int] = FileUtils.readIntsFromFile("src/test/resources/michalz/algo/utils/intsFile.txt")
    intArray should be (Array(-7, 22, 4, -12))
  }
}
