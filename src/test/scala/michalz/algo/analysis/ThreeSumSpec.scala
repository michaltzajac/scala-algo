package michalz.algo.analysis

import org.scalatest.{Matchers, FunSpec}

/**
 * @author mzajac
 * @since 2014.11.27
 */
class ThreeSumSpec extends FunSpec with Matchers {
  describe("A ThreeSumSpec") {
    describe("A calculate method") {
      it("Should return 0 for empty list") {
        val nr: Int = ThreeSum.calculate(Array())
        nr should be (0)
      }
      
      it("Should return 0 for list of 1s") {
        ThreeSum.calculate(Array(1, 1, 1)) should be (0)
      }
      
      it("Should find one triple sumed to 0") {
        ThreeSum.calculate(Array(-3, -5, 10, 12, 16, 8)) should be (1)
      }
    }
  }
}
