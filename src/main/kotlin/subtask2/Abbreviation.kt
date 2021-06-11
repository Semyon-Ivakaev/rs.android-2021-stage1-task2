package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var result = ""
        val aArray = a.toUpperCase().toCharArray()

        for (el in aArray) {
            if (b.contains(el)) result += el
        }

        return if (result == b) "YES" else "NO"
    }
}
