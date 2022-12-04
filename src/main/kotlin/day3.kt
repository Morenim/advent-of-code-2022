package com.advent.day3

import kotlin.streams.asSequence

fun day3part1(lines: List<String>) = lines.sumOf { rucksack ->
    val secondCompartmentIndex = rucksack.length / 2
    val firstCompartment = parseCompartment(rucksack.substring(0, secondCompartmentIndex))
    val secondCompartment = parseCompartment(rucksack.substring(secondCompartmentIndex))

    val itemType = firstCompartment.find { secondCompartment.contains(it) }
        ?: throw IllegalStateException()

    priority(itemType)
}

fun day3part2(lines: List<String>) = lines.chunked(3).sumOf { teamRucksacks ->
    val firstCompartment = parseCompartment(teamRucksacks[0])
    val secondCompartment = parseCompartment(teamRucksacks[1])
    val thirdCompartment = parseCompartment(teamRucksacks[2])

    val itemType = firstCompartment.find { secondCompartment.contains(it) && thirdCompartment.contains(it) }
        ?: throw IllegalStateException()

    priority(itemType)
}

fun parseCompartment(line: String): Set<Char> = line.chars().asSequence().map { it.toChar() }.toSet()

fun priority(itemType: Char) = itemType.code - if (itemType.isLowerCase()) 96 else 38