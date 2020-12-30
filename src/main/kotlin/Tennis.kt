class Tennis {
    private var player2Score: Int = 0
    private var player1Score: Int = 0
    private val scoreLookup = mapOf(
            0 to "love",
            1 to "fifteen",
            2 to "thirty",
            3 to "forty"
    )
    fun score(): String {

        if(player1Score == player2Score){
            return "${scoreLookup[player1Score]}_all"
        }else{
            if (player1Score > 0) {
                return "${scoreLookup[player1Score]}_love"
            }
        }
        return "love_all"
    }

    fun firstPlayerScore() {
        player1Score++
    }

    fun secondPlayerScore() {
       player2Score++
    }
}