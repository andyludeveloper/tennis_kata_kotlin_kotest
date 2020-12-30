import io.kotest.core.spec.IsolationMode
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TennisTest : FunSpec() {
    override fun isolationMode() = IsolationMode.InstancePerTest

    private val sut: Tennis = Tennis()

    init {
        test("test love_all"){
            sut.score() shouldBe "love_all"
        }
        test("test fifteen_love"){
            sut.firstPlayerScore()
            sut.score() shouldBe "fifteen_love"
        }
    }
}