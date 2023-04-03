import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class Ex1UnitTest {
    @Before
    @Throws(Exception::class)
    fun setUp() {
        println("Before ")
    }

    @After
    @Throws(Exception::class)
    fun tearDown() {
        println("After ")
    }

    @Test
    fun equalString() {
        println("Je suis developpeuse Mobile")
        val str = "Je suis developpeuse Mobile"
        assertEquals("Je suis developpeuse Mobile", str)
    }
}