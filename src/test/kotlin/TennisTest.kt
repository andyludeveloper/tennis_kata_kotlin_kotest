import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TennisTest : FunSpec() {
    override fun isolationMode() = IsolationMode.InstancePerTest

    init {
        test("test love_all"){
            val sut = Tennis()
            sut.score() shouldBe "love_all"
        }
        test("test fifteen_love"){
            val sut = Tennis()
            sut.firstPlayerScore()
            sut.score() shouldBe "fifteen_love"
        }
    }
}