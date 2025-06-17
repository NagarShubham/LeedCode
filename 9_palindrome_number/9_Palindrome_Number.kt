fun isPalindrome(x: Int): Boolean {
    val str = x.toString()
    for (i in 0 until str.length / 2) {
        if (str[i] != str[str.length - 1 - i]) return false
    }
    return true
}