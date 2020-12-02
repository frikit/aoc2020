package com.github.aoc.utils

object InputParser {

    fun parseInput(input: Inputs): List<String> {
        val res = input.getInput()
            .split("\n")
            .map { it.trim() }

        println(res)

        return res
    }
}
