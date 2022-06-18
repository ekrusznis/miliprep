package com.ai.miliprep

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude=[DataSourceAutoConfiguration::class])
class MiliPrepApplication
    fun main(args: Array<String>) {
        runApplication<MiliPrepApplication>(*args)
        println("*** STARTED ***")

    }
