package com.github.aoc

import com.github.aoc.utils.*

fun main() {
    val input = InputParser.parseInput(InputDay7Problem2)
        .map { it.replace(".", "") }
        .map { it.replace("bags", "") }
        .map { it.replace("bag", "") }

    val bagType = "shiny gold"
    val res = findOtherColors(input, 1, bagType)

    Result.stopExecutionPrintResult(res - 1)
}

private fun findOtherColors(input: List<String>, currNumberOfBags: Int, bagType: String): Int {
    if (bagType == "no other") return 0

    var res = 1

    val colors = input.filter { it.split("contain")[0].contains(bagType) }
        .map { it.split("contain")[1].trim().split(",")
            .map { clr -> clr.trim() }
        }.flatten()
        .map { color ->
            val times = if (color.contains("no other")) 1 else color.split(" ")[0].trim().toInt()
            val colorType = color.replace(times.toString(), "").trim()

            times to colorType
        }

    colors.forEach {
        res += findOtherColors(input, it.first, it.second)
    }

    return res * currNumberOfBags
}
