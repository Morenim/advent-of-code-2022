package com.advent.day2

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day2Test {

    @Test
    fun testPartOneSample() {
        val lines = Day2Test::class.java.getResource("/day2/sample.txt").readText().lines()
        assertEquals(15, day2part1(lines))
    }

    @Test
    fun testPartOne() {
        val lines = Day2Test::class.java.getResource("/day2/part1.txt").readText().lines()
        assertEquals(15632, day2part1(lines))
    }

    @Test
    fun testPartTwoSample() {
        val lines = Day2Test::class.java.getResource("/day2/sample.txt").readText().lines()
        assertEquals(12, day2part2(lines))
    }

    @Test
    fun testPartTwo() {
        val lines = Day2Test::class.java.getResource("/day2/part1.txt").readText().lines()
        assertEquals(14416, day2part2(lines))
    }
}