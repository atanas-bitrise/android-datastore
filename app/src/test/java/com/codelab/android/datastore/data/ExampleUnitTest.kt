package com.codelab.android.datastore.data

import org.junit.Test
import org.junit.Rule
import org.junit.rules.*
import org.junit.Assert.*

import java.io.File
import java.io.FileOutputStream
import java.io.FileInputStream
import kotlinx.coroutines.ExperimentalCoroutinesApi

import com.codelab.android.datastore.UserPreferences
import com.codelab.android.datastore.data.UserPreferencesSerializer

import kotlinx.coroutines.test.runTest

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@ExperimentalCoroutinesApi
class ExampleUnitTest {

    @get:Rule val temporaryFolder = TemporaryFolder()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    
    @Test
    fun temporaryFolder_isCreated() = runTest {
        val file = temporaryFolder.newFile("test.txt")
        val outputStream = FileOutputStream(file)
        
        val stub = UserPreferences.newBuilder().build()
        val wrong = UserPreferences.newBuilder().setShowCompleted(false).build()
        UserPreferencesSerializer.writeTo(stub, outputStream)
        
        outputStream.close()
        
        val inputStream = FileInputStream(file)
        val readValue = UserPreferencesSerializer.readFrom(inputStream)
        inputStream.close()
        
        assertEquals(wrong, readValue)
    }
}
