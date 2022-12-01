package com.advent.day1

import kotlin.math.max

fun day1part1(lines: List<String>): Int {
    if (lines.isEmpty()) return 0
    // Cries in memory allocations.
    val sum = lines.takeWhile { it.isNotEmpty() }.sumOf { Integer.valueOf(it)  }
    return max(sum, day1part1(lines.dropWhile { it.isNotEmpty() }.dropWhile { it.isEmpty() }))
}

fun day1part2(lines: List<String>): Int {
    val acc = mutableListOf<Int>()
    var tail = lines
    while (true) {
        if (tail.isEmpty()) break
        acc += tail.takeWhile { it.isNotEmpty() }.sumOf { Integer.valueOf(it) }
        tail = tail.dropWhile { it.isNotEmpty() }.dropWhile { it.isEmpty() }
    }
    return acc.sortedDescending().subList(0, 3).sum()
}