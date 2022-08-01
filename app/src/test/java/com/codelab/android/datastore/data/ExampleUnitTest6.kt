package com.codelab.android.datastore.data

import org.junit.Test
import org.junit.Rule
import org.junit.Before
import org.junit.After
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
class ExampleUnitTest6 {

    @get:Rule val temporaryFolder = TemporaryFolder()

    lateinit var file: File

    @Before
    fun init() {
        file = temporaryFolder.newFile()
    }

    @After
    fun teardown() {
        file.delete()
    }
    
    fun temporaryFolder_run() = runTest {
        val outputStream = FileOutputStream(file)
        
        val stub = UserPreferences.newBuilder().build()
        UserPreferencesSerializer.writeTo(stub, outputStream)
        
        outputStream.close()
        
        val inputStream = FileInputStream(file)
        val readValue = UserPreferencesSerializer.readFrom(inputStream)
        inputStream.close()
        
        assertEquals(stub, readValue)
    }
    
    @Test fun temporaryFolderRun1() = temporaryFolder_run()
    @Test fun temporaryFolderRun2() = temporaryFolder_run()
    @Test fun temporaryFolderRun3() = temporaryFolder_run()
    @Test fun temporaryFolderRun4() = temporaryFolder_run()
    @Test fun temporaryFolderRun5() = temporaryFolder_run()
    @Test fun temporaryFolderRun6() = temporaryFolder_run()
    @Test fun temporaryFolderRun7() = temporaryFolder_run()
    @Test fun temporaryFolderRun8() = temporaryFolder_run()
    @Test fun temporaryFolderRun9() = temporaryFolder_run()
    @Test fun temporaryFolderRun10() = temporaryFolder_run()
    @Test fun temporaryFolderRun11() = temporaryFolder_run()
    @Test fun temporaryFolderRun12() = temporaryFolder_run()
    @Test fun temporaryFolderRun13() = temporaryFolder_run()
    @Test fun temporaryFolderRun14() = temporaryFolder_run()
    @Test fun temporaryFolderRun15() = temporaryFolder_run()
    @Test fun temporaryFolderRun16() = temporaryFolder_run()
    @Test fun temporaryFolderRun17() = temporaryFolder_run()
    @Test fun temporaryFolderRun18() = temporaryFolder_run()
    @Test fun temporaryFolderRun19() = temporaryFolder_run()
    @Test fun temporaryFolderRun20() = temporaryFolder_run()
    @Test fun temporaryFolderRun21() = temporaryFolder_run()
    @Test fun temporaryFolderRun22() = temporaryFolder_run()
    @Test fun temporaryFolderRun23() = temporaryFolder_run()
    @Test fun temporaryFolderRun24() = temporaryFolder_run()
    @Test fun temporaryFolderRun25() = temporaryFolder_run()
    @Test fun temporaryFolderRun26() = temporaryFolder_run()
    @Test fun temporaryFolderRun27() = temporaryFolder_run()
    @Test fun temporaryFolderRun28() = temporaryFolder_run()
    @Test fun temporaryFolderRun29() = temporaryFolder_run()
    @Test fun temporaryFolderRun30() = temporaryFolder_run()
    @Test fun temporaryFolderRun31() = temporaryFolder_run()
    @Test fun temporaryFolderRun32() = temporaryFolder_run()
    @Test fun temporaryFolderRun33() = temporaryFolder_run()
    @Test fun temporaryFolderRun34() = temporaryFolder_run()
    @Test fun temporaryFolderRun35() = temporaryFolder_run()
    @Test fun temporaryFolderRun36() = temporaryFolder_run()
    @Test fun temporaryFolderRun37() = temporaryFolder_run()
    @Test fun temporaryFolderRun38() = temporaryFolder_run()
    @Test fun temporaryFolderRun39() = temporaryFolder_run()
    @Test fun temporaryFolderRun40() = temporaryFolder_run()
    @Test fun temporaryFolderRun41() = temporaryFolder_run()
    @Test fun temporaryFolderRun42() = temporaryFolder_run()
    @Test fun temporaryFolderRun43() = temporaryFolder_run()
    @Test fun temporaryFolderRun44() = temporaryFolder_run()
    @Test fun temporaryFolderRun45() = temporaryFolder_run()
    @Test fun temporaryFolderRun46() = temporaryFolder_run()
    @Test fun temporaryFolderRun47() = temporaryFolder_run()
    @Test fun temporaryFolderRun48() = temporaryFolder_run()
    @Test fun temporaryFolderRun49() = temporaryFolder_run()
    @Test fun temporaryFolderRun50() = temporaryFolder_run()
    @Test fun temporaryFolderRun51() = temporaryFolder_run()
    @Test fun temporaryFolderRun52() = temporaryFolder_run()
    @Test fun temporaryFolderRun53() = temporaryFolder_run()
    @Test fun temporaryFolderRun54() = temporaryFolder_run()
    @Test fun temporaryFolderRun55() = temporaryFolder_run()
    @Test fun temporaryFolderRun56() = temporaryFolder_run()
    @Test fun temporaryFolderRun57() = temporaryFolder_run()
    @Test fun temporaryFolderRun58() = temporaryFolder_run()
    @Test fun temporaryFolderRun59() = temporaryFolder_run()
    @Test fun temporaryFolderRun60() = temporaryFolder_run()
    @Test fun temporaryFolderRun61() = temporaryFolder_run()
    @Test fun temporaryFolderRun62() = temporaryFolder_run()
    @Test fun temporaryFolderRun63() = temporaryFolder_run()
    @Test fun temporaryFolderRun64() = temporaryFolder_run()
    @Test fun temporaryFolderRun65() = temporaryFolder_run()
    @Test fun temporaryFolderRun66() = temporaryFolder_run()
    @Test fun temporaryFolderRun67() = temporaryFolder_run()
    @Test fun temporaryFolderRun68() = temporaryFolder_run()
    @Test fun temporaryFolderRun69() = temporaryFolder_run()
    @Test fun temporaryFolderRun70() = temporaryFolder_run()
    
}
