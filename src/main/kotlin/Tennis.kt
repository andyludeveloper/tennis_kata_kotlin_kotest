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
            if (player1Score >= 3) {
                return "deuce"
            }
            return "${stringLookup[player1Score]}_all"
        }

        if(player1Score >= 3 && player1Score - player2Score == 1) {
            return "$player1Name adv"
        }

        return "${stringLookup[player1Score]}_${stringLookup[player2Score]}"
    }

    fun firstPlayerScore() {
        player1Score++
    }

    fun secondPlayerScore() {
        player2Score++
    }

}
