package com.example.student_management.model

class Model private constructor() {

    val students: MutableList<Student> = ArrayList()

    companion object {
        val shared = Model()
    }

    init {
            val student = Student(
                name = "Random User",
                id = "123456789",
                address = "Somewhere",
                phone = "987654321",
                avatarUrl = "",
                isChecked = false
            )
            students.add(student)
    }
}