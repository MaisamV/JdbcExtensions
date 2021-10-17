package com.mvs.sql

import java.sql.Connection
import java.sql.Statement
import javax.sql.DataSource

fun <T> DataSource.use(block: (Statement) -> T) : T {
    return this.connection.use(block)
}

fun <T> Connection.use(block: (Statement) -> T) : T {
    return try {
        block.invoke(this.createStatement())
    } finally {
        this.close()
    }
}