class Tennis {
    private var player1Score: Int = 0
    private val scoreLookup = mapOf(
            1 to "fifteen",
            2 to "thirty"
    )
    fun score(): String {
        if (player1Score > 0) {
            return "${scoreLookup[player1Score]}_love"
        }
        return "love_all"
    }

    fun firstPlayerScore() {
        player1Score++
    }
}