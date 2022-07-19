package io.bitrise.sample.android

import org.junit.Test
import org.junit.Rule
import org.junit.rules.*
import org.junit.Assert.*

import java.io.File
import java.io.FileOutputStream
import kotlinx.coroutines.ExperimentalCoroutinesApi

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
    fun temporaryFolder_isCreated() {
        val directory = temporaryFolder.newFolder()
        val file = temporaryFolder.newFile()
        val outputStream = FileOutputStream(file)
        
        outputStream.write(42)
        outputStream.close()
        
        val inputStream = FileInputStream(file)
        val readValue = inputStream.read()
        inputStream.close()
        
        assertEquals(42, readValue)
    }
}
