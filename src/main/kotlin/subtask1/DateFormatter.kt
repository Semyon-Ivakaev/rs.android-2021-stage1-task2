package subtask1

import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import java.util.zip.DataFormatException

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val parseFormatter = DateTimeFormatter.ofPattern("d MMMM, EEEE").withLocale(Locale.forLanguageTag("Ru"))
        return try {
            LocalDate.of(year.toInt(), month.toInt(), day.toInt()).format(parseFormatter)
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
