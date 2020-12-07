package com.github.aoc

import com.github.aoc.utils.*

fun main() {
    val input = InputParser.parseInput(InputDay6Problem2, "\n\n")

    var res = 0

    for (groups in input) {
        when {
            //one line with all yes
            groups.count {  it == '\n' } == 0 -> res += groups.length
            //two lines with potential common elements
            groups.count { it == '\n' } == 1 -> {
                val g1 = groups.split("\n")[0].toCharArray().toList()
                val g2 = groups.split("\n")[1].toCharArray().toList()

                res += g1.filter { e -> g2.contains(e) }
                    .count()
            }
            else -> {
                val g1 = groups.split("\n").sorted().last().toCharArray().toList()
                val rows = groups.split("\n").toList().map { it.toCharArray().toList() }

                g1.forEach { char ->
                    val elements = rows.filter { row -> row.toCharArray().contains(char)}.count()

                    if (elements == rows.size) res += 1
                }
            }
        }
    }

    Result.stopExecutionPrintResult(res)

}
