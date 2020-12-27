import kotlin.math.abs

class Tennis(val player1Name:String, val player2Name:String) {
    var player1Score = 0
    var player2Score = 0

    fun score(): String {
        val stringLookup = mapOf(
            0 to "love",
            1 to "fifteen",
            2 to "thirty",
            3 to "forty"
        )
        if (player1Score == player2Score) {
            if (isDeuce()) {
                return "deuce"
            }
            return "${stringLookup[player1Score]}_all"
        }
        if(player1Score >= 3 && player2Score >= 3 ) {
             if(abs(player1Score - player2Score) == 1) {
                 return "${advPlayer()} adv"
             }
        }

        return "${stringLookup[player1Score]}_${stringLookup[player2Score]}"
    }

    private fun advPlayer() = if (player1Score > player2Score) player1Name else player2Name

    private fun isDeuce() = player1Score >= 3

    fun firstPlayerScore() {
        player1Score++
    }

    fun secondPlayerScore() {
        player2Score++
    }

}
