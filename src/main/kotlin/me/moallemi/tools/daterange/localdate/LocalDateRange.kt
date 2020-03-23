package me.moallemi.tools.daterange.localdate

import java.time.LocalDate

class LocalDateRange(
    override val start: LocalDate,
    override val endInclusive: LocalDate,
    private val stepDays: Long = 1
) : Iterable<LocalDate>, ClosedRange<LocalDate> {

    override fun iterator(): Iterator<LocalDate> =
        LocalDateIterator(start, endInclusive, stepDays)

    infix fun step(days: Long) = LocalDateRange(start, endInclusive, days)
}
