import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TennisTest : FunSpec(
    {
        test("test love all"){
            val sut = Tennis()
            sut.score() shouldBe "love_all"
        }
        test("test fifteen love"){
            val sut = Tennis()
            sut.firstPlayerScore()
            sut.score() shouldBe "fifteen_love"
        }

    }
)