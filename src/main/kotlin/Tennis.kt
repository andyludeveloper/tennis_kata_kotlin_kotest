class Tennis {
    var playerScore = 0

    fun score(): String {
        if(playerScore == 1)
            return "fifteen_love"
        if(playerScore == 2)
            return "thirty_love"
        return "love_all"
    }

    fun firstPlayerScore() {
        playerScore++
    }

}
