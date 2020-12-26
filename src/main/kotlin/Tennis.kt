class Tennis {
    var playerScore = 0

    fun score(): String {
        if(playerScore == 1)
            return "fifteen_love"
        return "love_all"
    }

    fun firstPlayerScore() {
        playerScore++
    }

}
