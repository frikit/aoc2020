package com.github.aoc

import com.github.aoc.utils.*

fun main() {
    val input = InputParser.parseInput(InputDay1Problem2)
        .map { Integer.valueOf(it) }

    for (f in input) {
        for (s in input) {
            for (t in input) {
                if (f != s && s != t && f + s + t == 2020) {
                    Result.stopExecutionPrintResult(f * s * t)
                }
            }
        }
    }
}
