import java.lang.StringBuilder
import kotlin.math.min

fun main(arr: Array<String>) {
    // minimumNumber(6,"#Nee&Raj@1")
//  minimumNumber(6,"#Nee&Raj@1")
   println(minimumNumber(4, "4444"))
}

fun minimumNumber(n: Int, password: String): Int {

    val list = mutableListOf(false, false, false, false)

    for (i in password.indices) {
        when (password[i]) {
            in 'a'..'z' -> {
                list[0] = true
            }
            in 'A'..'Z' -> {
                list[1] = true
            }
            in '0'..'9' -> {
                list[2] = true
            }
            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+' -> {
                list[3] = true
            }
        }
    }

   val shortLength=6-n
   val match= list.filter { values-> !values }.size
   return maxOf(shortLength,match)
}

