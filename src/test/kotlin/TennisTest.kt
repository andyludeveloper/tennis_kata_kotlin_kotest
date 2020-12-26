import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe



class TennisTest : FunSpec() {
    private val sut = Tennis()
   init {
        test("test love all"){
            player1Score(0)
            sut.score() shouldBe "love_all"
        }

        test("test fifteen love"){
            player1Score(1)
            sut.score() shouldBe "fifteen_love"
        }
        test("test thirty love"){
            player1Score(2)
            sut.score() shouldBe "thirty_love"
        }
    }

    private fun player1Score(i: Int) {
        for(score in 0 until i)
            sut.firstPlayerScore()
    }
}

