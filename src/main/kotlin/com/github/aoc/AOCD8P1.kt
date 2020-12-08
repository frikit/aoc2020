package com.github.aoc

import com.github.aoc.utils.InputDay8Problem1
import com.github.aoc.utils.InputParser
import com.github.aoc.utils.Result

fun main() {
    val input = InputParser.parseInput(InputDay8Problem1)

    val executedOperations = hashSetOf<String>()
    val res = doInstructionGetAcc(input, 0, 0, executedOperations)

    Result.stopExecutionPrintResult(res)
}

private fun doInstructionGetAcc(
    input: List<String>,
    index: Int,
    accumulatort: Int,
    executedOperations: HashSet<String>
): Int {
    var acc = accumulatort

    val instruction = input[index]
    val typeOfInstruction = instruction.split(" ")[0].trim()
    val operationNumber = instruction.split(" ")[1]
        .replace("+", "")
        .replace("-", "")
        .toInt()
    val isMinus = instruction.contains("-")

    executedOperations.add("$index-$instruction")

    val potIndex = when {
        typeOfInstruction == "nop" -> index + 1
        typeOfInstruction == "acc" -> index + 1
        isMinus -> index - operationNumber
        else -> index + operationNumber
    }

    val potInstr = input[potIndex]
    val expKey = "$potIndex-$potInstr"
    if (executedOperations.contains(expKey))
        return acc
    else {
        executedOperations.add(expKey)
    }

    if (typeOfInstruction == "acc") {
        if (isMinus) acc -= operationNumber else acc += operationNumber
    }

    return doInstructionGetAcc(input, potIndex, acc, executedOperations)
}
