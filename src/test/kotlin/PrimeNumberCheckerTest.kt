import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*

@RunWith(Parameterized::class)
class PrimeNumberCheckerTest(
    private val numeroEntree: Int,
    private val resultatAttendu: Boolean
) {
    private var primeNumberChecker: PrimeNumberChecker? = null
    @Before
    fun initialize() {
        primeNumberChecker = PrimeNumberChecker()
    }

    companion object {
        @Parameterized.Parameters
        fun primeNumbers(): Collection<*> {
            return Arrays.asList(
                *arrayOf(
                    arrayOf<Any>(2, true),
                    arrayOf<Any>(6, false),
                    arrayOf<Any>(19, true),
                    arrayOf<Any>(22, false),
                    arrayOf<Any>(23, true),
                    arrayOf<Any>(73, true),
                    arrayOf<Any>(121, false)
                )
            )
        }
    }
    @Test
    fun testPrimeNumberChecker() {
        println("Nombre paramétré est : $numeroEntree")
        assertEquals(
            resultatAttendu,
            primeNumberChecker!!.validate(numeroEntree)
        )
    }
}