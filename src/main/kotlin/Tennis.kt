import kotlin.math.abs

class Tennis(private val player1Name: String, private val player2Name: String) {
    private var player2Score: Int = 0
    private var player1Score: Int = 0
    private val scoreLookup = mapOf(
            0 to "love",
            1 to "fifteen",
            2 to "thirty",
            3 to "forty"
    )

    fun score(): String {

        if (isSameScore()) {
            if (isDeuce()) {
                return "deuce"
            }
            return "${scoreLookup[player1Score]}_all"
        } else {
            if (isReadyForWin()) {
                if (isAdv()) {
                    return "${advName()}_adv"
                }
                if (isWin()) {
                    return "${advName()}_win"
                }
            }
            return "${scoreLookup[player1Score]}_${scoreLookup[player2Score]}"
        }
    }

    private fun isWin() = abs(player1Score - player2Score) == 2

    private fun isAdv() = abs(player1Score - player2Score) == 1

    private fun isReadyForWin() = player1Score >= 3 && player2Score >= 3

    private fun isDeuce() = player1Score >= 3

    private fun isSameScore() = player1Score == player2Score

    private fun advName() = if (player1Score > player2Score) player1Name else player2Name

    fun firstPlayerScore() {
        player1Score++
    }

    fun secondPlayerScore() {
        player2Score++
    }
}