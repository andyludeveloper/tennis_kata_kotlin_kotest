class Tennis {
    private var player1Score: Int = 0

    fun score(): String {
        if (player1Score == 1) {
            return "fifteen_love"
        }
        if(player1Score == 2){
            return "thirty_love"
        }
        return "love_all"
    }

    fun firstPlayerScore() {
        player1Score++
    }
}