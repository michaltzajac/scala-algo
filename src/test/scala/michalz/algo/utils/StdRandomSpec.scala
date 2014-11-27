package michalz.algo.utils

import org.scalatest.{FunSpec, Matchers, FlatSpec}

/**
 * @author mzajac
 * @since 2014.11.27
 */
class StdRandomSpec extends FunSpec with Matchers {
  val stdRandom = new StdRandom(2384128314l)
  
  describe("A StdRandom") {
    describe("A intRange") {
      it("should generate correct number of ints") {
        val generatedInts: Array[Int] = stdRandom.intRange(100, 0, 10)
        
        generatedInts should have size 100
      }
      
      it("should generate ints from specified range") {
        val generatedInts: Array[Int] = stdRandom.intRange(10000000, -1000, 1000)
        
        generatedInts.max should be <= 1000
        generatedInts.min should be >= -1000
      }
    }
  }
  
}
