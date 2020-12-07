package com.github.aoc

import com.github.aoc.utils.*

fun main() {
    val input = InputParser.parseInput(InputDay7Problem1)
        .map { it.replace(".", "") }
        .map { it.replace("bags", "") }
        .map { it.replace("bag", "") }
        .sortedBy { it.length }

    val bagType = "shiny gold"
    val res = findOtherColors(input, bagType)

    Result.stopExecutionPrintResult(res.size)
}

private fun findOtherColors(input: List<String> , bagType: String): HashSet<String> {
    val res = hashSetOf<String>()

    val colors = input.filter { it.split("contain")[1].contains(bagType) }
        .map { it.split("contain")[0].trim() }
    res.addAll(colors)

    colors.forEach { color ->
        res.addAll(findOtherColors(input, color))
    }

    return res
}
