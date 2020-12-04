package com.github.aoc

import com.github.aoc.utils.*

fun main() {
    val input = InputParser.parseInput(InputDay3Problem1)
        .map { row -> row.repeat(100) }

    var countTrees = 0
    var currIndexColumn = 3

    (1 until input.size).forEach { rowIdx ->
        val char = input[rowIdx].toCharArray().toList()[currIndexColumn]

        if (char == '#') countTrees++

        currIndexColumn += 3
    }

    Result.stopExecutionPrintResult(countTrees)
}
