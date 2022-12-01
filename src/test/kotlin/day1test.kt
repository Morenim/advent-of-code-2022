package com.advent.day1

import kotlin.test.Test
import kotlin.test.assertEquals

internal class Day1Test {

    @Test
    fun testPartOneSample() {
        val lines = Day1Test::class.java.getResource("/day1/sample.txt").readText().lines()
        assertEquals(24000, day1part1(lines))
    }

    @Test
    fun testPartOne() {
        val lines = Day1Test::class.java.getResource("/day1/part1.txt").readText().lines()
        assertEquals(70374, day1part1(lines))
    }

    @Test
    fun testPartTwoSample() {
        val lines = Day1Test::class.java.getResource("/day1/sample.txt").readText().lines()
        assertEquals(45000, day1part2(lines))
    }

    @Test
    fun testPartTwo() {
        val lines = Day1Test::class.java.getResource("/day1/part1.txt").readText().lines()
        assertEquals(204610, day1part2(lines))
    }
}