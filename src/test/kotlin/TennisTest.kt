import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TennisTest : FunSpec() {
    override fun isolationMode() = IsolationMode.InstancePerTest

    private val sut: Tennis = Tennis()

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

    }

    private fun firstPlayerScoreTimes(times: Int) {
        for(time in 0 until times){
            sut.firstPlayerScore()
        }
    }
}