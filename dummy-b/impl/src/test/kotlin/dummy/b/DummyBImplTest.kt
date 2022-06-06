package dummy.b

import kotlin.test.Test
import kotlin.test.assertEquals

internal class DummyBImplTest {

    private val dummyA = DummyBImpl()

    @Test
    fun `dummyB must return B`() {
        assertEquals("B", dummyA.dummyB())
    }

}