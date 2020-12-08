package com.github.aoc

import com.github.aoc.utils.InputDay8Problem2
import com.github.aoc.utils.InputParser

fun main() {
    val input = InputParser.parseInput(InputDay8Problem2)
        .toMutableList()

    val wrongIndex = findWrongStatementIndex(input, 0, mutableListOf())

    println("Current input is :  $input")
    input[wrongIndex] = input[wrongIndex].replace("jmp", "nop")
    println("Replaced input is : $input")

    val res = doInstructionGetAcc(input, 0, 0, mutableListOf())


    println(res)

}

private fun findWrongStatementIndex(
    input: List<String>,
    index: Int,
    executedOperations: MutableList<String>
): Int {

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

    val expKey = "$index-$instruction"
    if (executedOperations.contains(expKey)
        && (typeOfInstruction == "jmp" || typeOfInstruction == "nop")
        && isMinus
    )
        return index
    else if (!executedOperations.contains(expKey)) {
        executedOperations.add(expKey)
    }

    return findWrongStatementIndex(input, potIndex, executedOperations.toHashSet().toMutableList())
}

private fun doInstructionGetAcc(
    input: List<String>,
    index: Int,
    accumulatort: Int,
    executedOperations: MutableList<String>
): Int {
    var acc = accumulatort

    if (input.size <= index) return acc

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

    if (typeOfInstruction == "acc") {
        if (isMinus) acc -= operationNumber else acc += operationNumber
    }

//    if (input.size <= potIndex) return acc
//
//    val potInstr = input[potIndex]
    val expKey = "$potIndex-$instruction"
    if (executedOperations.contains(expKey))
        return acc
    else {
        executedOperations.add(expKey)
    }


    return doInstructionGetAcc(input, potIndex, acc, executedOperations)
}
