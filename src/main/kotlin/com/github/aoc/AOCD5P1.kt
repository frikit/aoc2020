package com.github.aoc

import com.github.aoc.utils.InputDay5Problem1
import com.github.aoc.utils.InputParser
import com.github.aoc.utils.Result
import kotlin.math.abs
import kotlin.math.roundToInt

fun main() {
    val input = InputParser.parseInput(InputDay5Problem1)

    val res = mutableListOf<Int>()

    input.forEach { inp ->
        var row = 0..Byte.MAX_VALUE.toInt()
        var column = 0..7

        for (char in inp.toCharArray().toList()) {
            print("$char ")
            when (char) {
                'F' ->
                    row = if (abs(row.last - row.first) == 1)
                        row.first..row.first
                    else if (row.first == 0)
                        row.first..row.last / 2
                    else
                        row.first..(row.first + row.last) / 2
                'B' ->
                    row = if (abs(row.last - row.first) == 1)
                        row.last..row.last
                    else
                        ((row.first + row.last).toDouble() / 2).roundToInt()..row.last
                'L' ->
                    column = if (abs(column.last - column.first) == 1)
                        column.first..column.first
                    else if (column.first == 0)
                        column.first..column.last / 2
                    else
                        column.first..(column.first + column.last) / 2
                'R' ->
                    column = if (abs(column.last - column.first) == 1)
                        column.last..column.last
                    else
                        ((column.first + column.last).toDouble() / 2).roundToInt()..column.last
            }
            if (char == 'F' || char == 'B')
                println(row.first.toString() + ".." + row.last)
            else
                println(column.first.toString() + ".." + column.last)
        }

        res.add(row.first * 8 + column.first)
    }


    Result.stopExecutionPrintResult(res.max()!!)

}
