package com.github.aoc

import com.github.aoc.utils.*

fun main() {
    val input = InputParser.parseInput(InputDay2Problem1)

    val total = input.filter { row ->
        val f = row.split(" ")[0].split("-")[0].trim().toInt()
        val s = row.split(" ")[0].split("-")[1].trim().toInt()
        val letter = row.split(" ")[1].replace(":", "").trim()
        val password = row.split(" ").last().toString().trim()
        val count = password.toCharArray().toList().count { it.toString() == letter }

        count in f..s
    }.count()

    Result.stopExecutionPrintResult(total)
}
