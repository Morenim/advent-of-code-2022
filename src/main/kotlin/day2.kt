package com.advent.day2

import kotlin.math.round

fun day2part1(lines: List<String>): Int {
    return lines.sumOf {
        val (opponentHand, playerHand) = it.split(" ")
        scorePlayerHand(playerHand) + scoreRound(opponentHand, playerHand)
    }
}

fun day2part2(lines: List<String>): Int {
    return lines.sumOf {
        val (opponentHand, roundResult) = it.split(" ")
        scorePlayerHand(matchResult(opponentHand, roundResult)) + scoreResult(roundResult)
    }
}

fun scorePlayerHand(hand: String) = when (hand) {
    "X" -> 1
    "Y" -> 2
    "Z" -> 3
    else -> throw IllegalStateException()
}

fun scoreRound(opponent: String, player: String): Int {
    return if ((player == "X" && opponent == "A")
        || (player == "Y" && opponent == "B")
        || (player == "Z" && opponent == "C")) {
        3
    } else if ((player == "X" && opponent == "C")
        || (player == "Y" && opponent == "A")
        || (player == "Z" && opponent == "B")) {
        6
    } else {
        0
    }
}

fun matchResult(opponentHand: String, roundResult: String) = when (roundResult) {
    "X" -> when (opponentHand) {
        "A" -> "Z"
        "B" -> "X"
        "C" -> "Y"
        else -> throw IllegalStateException()
    }
    "Y" -> when (opponentHand) {
        "A" -> "X"
        "B" -> "Y"
        "C" -> "Z"
        else -> throw IllegalStateException()
    }
    "Z" -> when (opponentHand) {
        "A" -> "Y"
        "B" -> "Z"
        "C" -> "X"
        else -> throw IllegalStateException()
    }
    else -> throw IllegalStateException()
}

fun scoreResult(roundResult: String) = when (roundResult) {
    "X" -> 0
    "Y" -> 3
    "Z" -> 6
    else -> throw IllegalStateException()
}
