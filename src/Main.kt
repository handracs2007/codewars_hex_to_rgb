// https://www.codewars.com/kata/5282b48bb70058e4c4000fa7/train/kotlin

data class RGB(val r: Int, val g: Int, val b: Int)

fun hexStringToRGB(hexString: String): RGB {
    val hexR = hexString.substring(1, 3)
    val hexG = hexString.substring(3, 5)
    val hexB = hexString.substring(5, 7)

    val r = hexR.toInt(16)
    val g = hexG.toInt(16)
    val b = hexB.toInt(16)

    return RGB(r, g, b)
}

fun main() {
    println(hexStringToRGB("#FF9933"))
    println(hexStringToRGB("#beaded"))
}