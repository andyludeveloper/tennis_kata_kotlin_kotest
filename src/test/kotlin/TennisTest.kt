import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TennisTest : FunSpec() {
    override fun isolationMode() = IsolationMode.InstancePerTest

    private val sut: Tennis = Tennis("John", "Alex")

    init {
        test("test love_all"){
            firstPlayerScoreTimes(0)
            sut.score() shouldBe "love_all"
        }
        test("test fifteen_love"){
            firstPlayerScoreTimes(1)
            sut.score() shouldBe "fifteen_love"
        }
        test("test thirty_love"){
            firstPlayerScoreTimes(2)
            sut.score() shouldBe "thirty_love"
        }
        test("test forty_love"){
            firstPlayerScoreTimes(3)
            sut.score() shouldBe "forty_love"
        }
        test("test fifteen_all"){
            firstPlayerScoreTimes(1)
            secondPlayerScoreTimes(1)
            sut.score() shouldBe "fifteen_all"
        }
        test("test thirty_all"){
            firstPlayerScoreTimes(2)
            secondPlayerScoreTimes(2)
            sut.score() shouldBe "thirty_all"
        }
        test("test love_fifteen"){
            firstPlayerScoreTimes(0)
            secondPlayerScoreTimes(1)
            sut.score() shouldBe "love_fifteen"
        }
        test("test deuce"){
            firstPlayerScoreTimes(3)
            secondPlayerScoreTimes(3)
            sut.score() shouldBe "deuce"
        }
        test("test player1(John) adv"){
            firstPlayerScoreTimes(4)
            secondPlayerScoreTimes(3)
            sut.score() shouldBe "John_adv"
        }
        test("test player1(John) win"){
            firstPlayerScoreTimes(5)
            secondPlayerScoreTimes(3)
            sut.score() shouldBe "John_win"
        }

    }

    private fun secondPlayerScoreTimes(times: Int) {
        for(time in 0 until times){
            sut.secondPlayerScore()
        }
    }

    private fun firstPlayerScoreTimes(times: Int) {
        for(time in 0 until times){
            sut.firstPlayerScore()
        }
    }
}