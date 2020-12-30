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
    }
}