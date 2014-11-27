package michalz.algo.utils

import org.scalatest.{FunSpec, Matchers, FlatSpec}

/**
 * @author mzajac
 * @since 2014.11.27
 */
class StdRandomSpec extends FunSpec with Matchers {
  val stdRandom = new StdRandom(StdRandomSpec.seed)

  describe("A StdRandom") {
    describe("A intRange") {
      it("should generate correct number of ints") {
        val generatedInts: Array[Int] = stdRandom.intRange(StdRandomSpec.numberOfIntsSmall, StdRandomSpec.fromRangeSmall, StdRandomSpec.toRangeSmall)

        generatedInts should have size StdRandomSpec.numberOfIntsSmall
      }

      it("should generate ints from specified range") {
        val generatedInts: Array[Int] = stdRandom.intRange(StdRandomSpec.numberOfIntsBig, StdRandomSpec.fromRangeBig, StdRandomSpec.toRangeBig)

        generatedInts.max should be <= StdRandomSpec.toRangeBig
        generatedInts.min should be >= StdRandomSpec.fromRangeBig
      }
    }
  }

}

object StdRandomSpec {
  val toRangeBig: Int = 1000
  val fromRangeBig: Int = -1000
  val numberOfIntsBig: Int = 10000000
  val toRangeSmall: Int = 10
  val fromRangeSmall: Int = 0
  val seed: Long = 2384128314L
  val numberOfIntsSmall: Int = 100
}
