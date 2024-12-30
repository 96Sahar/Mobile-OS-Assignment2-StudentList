package com.example.student_management.model

class Model private constructor() {

    val students: MutableList<Student> = ArrayList()

    companion object {
        val shared = Model()
    }

    init {
            val student = Student(
                name = "Sahar Yosef",
                id = "202321232",
                address = "Tel-Aviv",
                phone = "123456789",
                avatarUrl = "",
                isChecked = false
            )
            students.add(student)
    }
}