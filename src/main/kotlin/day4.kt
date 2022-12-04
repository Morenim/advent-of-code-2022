package com.advent.day4

data class Assignments(val left: Assignment, val right: Assignment)

data class Assignment(val start: Int, val end: Int)

fun day4part1(lines: List<String>): Int = lines
    .map { mapToAssignments(it) }
    .count { assignments ->
        fullyContains(assignments.left, assignments.right) || fullyContains(
            assignments.right,
            assignments.left
        )
    }

fun day4part2(lines: List<String>): Int = lines
    .map { mapToAssignments(it) }
    .count { assignments -> overlaps(assignments) }

fun mapToAssignments(line: String): Assignments {
    val rawPair = line.split(",")
    return Assignments(parseAssignment(rawPair[0]), parseAssignment(rawPair[1]))
}

fun parseAssignment(line: String): Assignment {
    val parts = line.split('-')
    return Assignment(start = parts[0].toInt(), end = parts[1].toInt())
}

fun fullyContains(assignmentA: Assignment, assignmentB: Assignment): Boolean =
    (assignmentB.start >= assignmentA.start && assignmentB.end <= assignmentA.end)

fun overlaps(assignments: Assignments): Boolean = if (assignments.left.start <= assignments.right.start)
    overlaps(assignments.left, assignments.right) else overlaps(assignments.right, assignments.left)

fun overlaps(assignmentA: Assignment, assignmentB: Assignment) = assignmentA.end >= assignmentB.start