package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    // blockA - массив с данными
    // blockB - класс объекта, с которым работать
    // blockC - это Any
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            String::class -> concatenateString(blockA)
            Int::class -> sumInt(blockA)
            LocalDate::class -> checkDate(blockA)
            else -> ""
        }
    }

    private fun concatenateString(blockA: Array<*>): String {
        var result: String = ""
        for (el in blockA) {
            if (el is String) {
                result += el
            }
        }

        return result
    }

    private fun sumInt(blockA: Array<*>): Int {
        var result: Int = 0
        for (el in blockA) {
            if (el is Int) {
                result += el
            }
        }

        return result
    }

    private fun checkDate(blockA: Array<*>): String {
        var result: String = "0001-01-31"
        val parseFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd").withLocale(Locale.US)
        val parseResult = DateTimeFormatter.ofPattern("dd.MM.yyyy").withLocale(Locale.US)
        for (el in blockA) {
            if (el is LocalDate) {
                if (el > LocalDate.parse(result, parseFormat)) result = el.toString()
            }
        }

        return LocalDate.parse(result).format(parseResult)
    }
}
