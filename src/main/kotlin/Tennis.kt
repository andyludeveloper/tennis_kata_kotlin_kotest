class Tennis {
    var player1Score = 0

    fun score(): String {
        val stringLookup = mapOf(
            1 to "fifteen",
            2 to "thirty",
            3 to "forty"
        )
        if(player1Score > 0)
            return "${stringLookup[player1Score]}_love"

        return "love_all"
    }

    fun firstPlayerScore() {
        player1Score++
    }

}
