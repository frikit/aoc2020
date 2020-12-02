package com.github.aoc.utils

import kotlin.system.exitProcess

object Result {

    fun stopExecutionPrintResult(any: Any) {
        println("The result is: $any")

        exitProcess(0)
    }
}
