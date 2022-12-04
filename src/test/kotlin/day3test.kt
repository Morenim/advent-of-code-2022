package com.advent.day3

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day3Test {

    @Test
    fun testPartOneSample() {
        val lines = Day3Test::class.java.getResource("/day3/sample.txt").readText().lines()
        assertEquals(157, day3part1(lines))
    }

    @Test
    fun testPartOne() {
        val lines = Day3Test::class.java.getResource("/day3/part1.txt").readText().lines()
        assertEquals(7793, day3part1(lines))
    }

    @Test
    fun testPartTwoSample() {
        val lines = Day3Test::class.java.getResource("/day3/sample.txt").readText().lines()
        assertEquals(70, day3part2(lines))
    }

    @Test
    fun testPartTwo() {
        val lines = Day3Test::class.java.getResource("/day3/part1.txt").readText().lines()
        assertEquals(2499, day3part2(lines))
    }
}
