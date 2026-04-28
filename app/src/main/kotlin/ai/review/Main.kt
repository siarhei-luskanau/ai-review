package ai.review

fun main() {
    val actual = 2 + 2 * 2
    val expected = 6
    if (actual != expected) {
        throw Error("Math error, actual=$actual, expected=$expected")
    }
}
