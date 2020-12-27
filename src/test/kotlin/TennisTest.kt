import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe



class TennisTest : FunSpec() {
    private val sut = Tennis("Andy", "Jack")
    override fun isolationMode() = IsolationMode.InstancePerTest

   init {

        test("test love all"){
            player1Score(0)
            player2Score(0)
            sut.score() shouldBe "love_all"
        }

        test("test fifteen love"){
            player1Score(1)
            player2Score(0)
            sut.score() shouldBe "fifteen_love"
        }


        test("test thirty love"){
            player1Score(2)
            player2Score(0)
            sut.score() shouldBe "thirty_love"
        }

        test("test forty love"){
            player1Score(3)
            player2Score(0)
            sut.score() shouldBe "forty_love"
        }

       test("test love fifteen"){
           player1Score(0)
           player2Score(1)
           sut.score() shouldBe "love_fifteen"
       }
       test("test love thirty"){
           player1Score(0)
           player2Score(2)
           sut.score() shouldBe "love_thirty"
       }
       test("test love forty"){
           player1Score(0)
           player2Score(3)
           sut.score() shouldBe "love_forty"
       }
       test("test fifteen all"){
           player1Score(1)
           player2Score(1)
           sut.score() shouldBe "fifteen_all"
       }
       test("test thirty all"){
           player1Score(2)
           player2Score(2)
           sut.score() shouldBe "thirty_all"
       }
       test("test deuce"){
           player1Score(3)
           player2Score(3)
           sut.score() shouldBe "deuce"
       }
       test("test player1 adv"){
           player1Score(4)
           player2Score(3)
           sut.score() shouldBe "Andy adv"
       }
       test("test player2 adv"){
           player1Score(3)
           player2Score(4)
           sut.score() shouldBe "Jack adv"
       }
    }

    private fun player2Score(i: Int) {
        for(score in 0 until i)
            sut.secondPlayerScore()
    }

    private fun player1Score(i: Int) {
        for(score in 0 until i)
            sut.firstPlayerScore()
    }
}

