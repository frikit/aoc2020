package com.github.aoc

import com.github.aoc.utils.*

fun main() {
    val input = InputParser.parseInput(InputDay6Problem1, "\n\n")
        .map { groups ->
            groups.replace("\n", " ")
                .replace("\r", " ")
                .replace(" ", "")
                .toCharArray()
                .toHashSet()
        }

    Result.stopExecutionPrintResult(input.sumBy { it.size })

}
