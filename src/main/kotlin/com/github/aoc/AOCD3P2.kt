package com.github.aoc

import com.github.aoc.utils.InputDay3Problem2
import com.github.aoc.utils.InputParser
import com.github.aoc.utils.Result

val input = InputParser.parseInput(InputDay3Problem2)
    .map { row -> row.repeat(100) }

fun main() {
    val slopes = listOf(
        1 to 1,
        3 to 1,
        5 to 1,
        7 to 1,
        1 to 2
    )

    var total = 1

    slopes.forEach {
        total *= trySlope(it.first, it.second)
    }

    Result.stopExecutionPrintResult(total)
}

private fun trySlope(start: Int, end: Int): Int {
    var countTrees = 0
    var currRow = 0
    var currColumn = 0

    while (currRow < input.size) {
        val char = input[currRow].toCharArray().toList()[currColumn]

        if (char == '#') countTrees++

        currRow += end
        currColumn += start
    }
    return countTrees
}
