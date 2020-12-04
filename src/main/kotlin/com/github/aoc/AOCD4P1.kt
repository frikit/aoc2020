package com.github.aoc

import com.github.aoc.utils.*

fun main() {
    val input = InputParser.parseInput(InputDay4Problem1, "\n\n")
        .map { it.replace("\n", " ") }
        .map { it.replace("\r", " ") }

    val map = input.map {
        it.split(" ").map { elem ->
            val key = elem.split(":")[0].trim()
            val value = elem.split(":")[1].trim()

            key to value
        }
    }.map {
        val res = hashMapOf<String, String>()
        it.forEach { pair ->
            res[pair.first] = pair.second
        }
        res
    }

    val countValid = map.map { validatePassport(it) }.filter { it }.count()


    Result.stopExecutionPrintResult(countValid)
}

/**
 * byr (Birth Year)
 * iyr (Issue Year)
 * eyr (Expiration Year)
 * hgt (Height)
 * hcl (Hair Color)
 * ecl (Eye Color)
 * pid (Passport ID)
 * cid (Country ID) - Optional
 */
private fun validatePassport(userMap: Map<String, String>): Boolean {
    val requiredProps = listOf("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid").sorted()

    val keyWithValues = userMap.map { (key, _) -> key }.sorted()

    return keyWithValues.containsAll(requiredProps)

}
