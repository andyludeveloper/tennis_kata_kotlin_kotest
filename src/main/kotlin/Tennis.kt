import kotlin.math.abs

class Tennis(val player1Name: String, val player2Name: String) {
    private var player2Score: Int = 0
    private var player1Score: Int = 0
    private val scoreLookup = mapOf(
            0 to "love",
            1 to "fifteen",
            2 to "thirty",
            3 to "forty"
    )

    fun score(): String {

        if (player1Score == player2Score) {
            if (player1Score < 3) {

                return "${scoreLookup[player1Score]}_all"
            }
            return "deuce"
        } else {
            if(player1Score >= 3 && player2Score>=3 ){
                if (player1Score > player2Score && player1Score - player2Score == 1) {
                    return "${player1Name}_adv"
                }
            }
            return "${scoreLookup[player1Score]}_${scoreLookup[player2Score]}"
        }
    }

    fun firstPlayerScore() {
        player1Score++
    }

    fun secondPlayerScore() {
        player2Score++
    }
}