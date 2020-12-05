package com.github.aoc

import com.github.aoc.utils.InputDay4Problem2
import com.github.aoc.utils.InputParser
import com.github.aoc.utils.Result

fun main() {
    // TC
//    byr valid:   2002
//    byr invalid: 2003
//
//    hgt valid:   60in
//    hgt valid:   190cm
//    hgt invalid: 190in
//    hgt invalid: 190
//
//    hcl valid:   #123abc
//    hcl invalid: #123abz
//    hcl invalid: 123abc
//
//    ecl valid:   brn
//    ecl invalid: wat
//
//    pid valid:   000000001
//    pid invalid: 0123456789

    //byr
    assert(isValidPassport(mapOf("byr" to "2002")))
    assert(!isValidPassport(mapOf("byr" to "2003")))

    //hgt
    assert(isValidPassport(mapOf("hgt" to "60in")))
    assert(isValidPassport(mapOf("hgt" to "190cm")))
    assert(!isValidPassport(mapOf("hgt" to "190in")))
    assert(!isValidPassport(mapOf("hgt" to "190")))

    //hcl
    assert(isValidPassport(mapOf("hcl" to "#123abc")))
    assert(!isValidPassport(mapOf("hcl" to "#123abz")))
    assert(!isValidPassport(mapOf("hcl" to "123abz")))

    //ecl
    assert(isValidPassport(mapOf("ecl" to "brn")))
    assert(!isValidPassport(mapOf("ecl" to "wat")))

    //pid
    assert(isValidPassport(mapOf("pid" to "000000001")))
    assert(!isValidPassport(mapOf("pid" to "0123456789")))

    //actual input
    val input = InputParser.parseInput(InputDay4Problem2, "\n\n")
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

    val valids = map.map { validatePassport(it) }.filter { it }.count()

    Result.stopExecutionPrintResult(valids)
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

    return if (keyWithValues.containsAll(requiredProps)) {
        isValidPassport(userMap)
    } else {
        false
    }
}

/**
byr (Birth Year) - four digits; at least 1920 and at most 2002.
iyr (Issue Year) - four digits; at least 2010 and at most 2020.
eyr (Expiration Year) - four digits; at least 2020 and at most 2030.
hgt (Height) - a number followed by either cm or in:
If cm, the number must be at least 150 and at most 193.
If in, the number must be at least 59 and at most 76.
hcl (Hair Color) - a # followed by exactly six characters 0-9 or a-f.
ecl (Eye Color) - exactly one of: amb blu brn gry grn hzl oth.
pid (Passport ID) - a nine-digit number, including leading zeroes.
cid (Country ID) - ignored, missing or not.
 */
private fun isValidPassport(userMap: Map<String, String>): Boolean {
    userMap.forEach { (key, value) ->
        if (key == "byr" && (value.length != 4 || value.length == 4 && value.toInt() !in 1920..2002)) {
            return false
        }
        if (key == "iyr" && (value.length != 4 || value.length == 4 && value.toInt() !in 2010..2020)) {
            return false
        }
        if (key == "eyr" && (value.length != 4 || value.length == 4 && value.toInt() !in 2020..2030)) {
            return false
        }
        if (key == "hgt" && value.contains("cm")) {
            val v = value.trim().replace("cm", "")
            if (v.length != 3 || v.length == 3 && v.toInt() !in 150..193) {
                return false
            }
        } else if (key == "hgt" && value.contains("in")) {
            val v = value.trim().replace("in", "")
            if (v.length != 2 || v.length == 2 && v.toInt() !in 59..76) {
                return false
            }
        } else if (key == "hgt") {
            return false
        }

        if (key == "hcl" && !value.matches("\\#[a-f0-9]{6}".toRegex())) {
            return false
        }

        val validEyeColors = "amb blu brn gry grn hzl oth".split(" ").toList()
        if (key == "ecl" && !validEyeColors.contains(value)) {
            return false
        }

        if (key == "pid" && !value.matches("[0-9]{9}".toRegex())) {
            return false
        }
    }

    return true
}
