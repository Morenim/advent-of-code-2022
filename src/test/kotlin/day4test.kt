package com.advent.day4

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day4Test {

    @Test
    fun testPartOneSample() {
        val lines = Day4Test::class.java.getResource("/day4/sample.txt").readText().lines()
        assertEquals(2, day4part1(lines))
    }

    @Test
    fun testPartOne() {
        val lines = Day4Test::class.java.getResource("/day4/part1.txt").readText().lines()
        assertEquals(599, day4part1(lines))
    }

    @Test
    fun testPartTwoSample() {
        val lines = Day4Test::class.java.getResource("/day4/sample.txt").readText().lines()
        assertEquals(4, day4part2(lines))
    }

    @Test
    fun testPartTwo() {
        val lines = Day4Test::class.java.getResource("/day4/part1.txt").readText().lines()
        assertEquals(2499, day4part2(lines))
    }
}
