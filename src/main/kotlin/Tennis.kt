import kotlin.math.abs

class Tennis(private val player1Name: String, private val player2Name: String) {
    private var player1Score = 0
    private var player2Score = 0
    private val stringLookup = mapOf(
        0 to "love",
        1 to "fifteen",
        2 to "thirty",
        3 to "forty"
    )

    fun score(): String {
        return if (isSameScore()) {
            if(isDeuce()) deuce() else sameScore()
        } else {
            if(isReadyForWin()) advState() else normalScore()
        }
    }

    private fun deuce() = "deuce"

    private fun sameScore() = "${stringLookup[player1Score]}_all"

    private fun normalScore() =
        "${stringLookup[player1Score]}_${stringLookup[player2Score]}"

    private fun advState() = "${advPlayer()} ${getWinOrAdv()}"

    private fun getWinOrAdv() = if (isAdv()) "adv" else "win"

    private fun isReadyForWin() = player1Score >= 3 && player2Score >= 3

    private fun isSameScore() = player1Score == player2Score

    private fun isAdv() = abs(player1Score - player2Score) == 1

    private fun advPlayer() = if (player1Score > player2Score) player1Name else player2Name

    private fun isDeuce() = player1Score >= 3

    fun firstPlayerScore() {
        player1Score++
    }

    fun secondPlayerScore() {
        player2Score++
    }

}
