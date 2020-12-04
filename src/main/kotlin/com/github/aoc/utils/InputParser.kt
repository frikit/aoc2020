package com.github.aoc.utils

object InputParser {

    fun parseInput(input: Inputs, pattern: String = "\n"): List<String> {
        val res = input.getInput()
            .split(pattern)
            .map { it.trim() }

        println(res)

        return res
    }
}
