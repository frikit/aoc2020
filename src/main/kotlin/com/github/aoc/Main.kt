package com.github.aoc

fun main() {
    val input = """
        3-4 j: tjjj
7-10 h: nhhhhhgghphhh
7-13 j: tpscbbstbdjsjbtcpj
4-13 l: ckllmqzlvcsxpplqg
    """.trimIndent()
        .split("\n")
        .map { it.trim() }

    println(input)

    val total = input.filter { row ->
        val f = row.split(" ")[0].split("-")[0].trim().toInt()
        val s = row.split(" ")[0].split("-")[1].trim().toInt()
        val letter = row.split(" ")[1].replace(":", "").trim()
        val password = row.split(" ").last().toString().trim()
        val first = password.toCharArray()[f - 1].toString() == letter
        val second = password.toCharArray()[s - 1].toString() == letter

        ((first && !second) || (!first && second))
    }.count()

    println(total)
}
