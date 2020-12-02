package com.github.aoc

import com.github.aoc.utils.InputDay1Problem1
import com.github.aoc.utils.InputParser
import com.github.aoc.utils.Result

fun main() {
    val input = InputParser.parseInput(InputDay1Problem1)
        .map { Integer.valueOf(it) }

    for (pivot in input) {
        for (each in input) {
            if (pivot != each && pivot + each == 2020) {
                Result.stopExecutionPrintResult(pivot * each)
            }
        }
    }
}
