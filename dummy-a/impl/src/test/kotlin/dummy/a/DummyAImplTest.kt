package dummy.a

import kotlin.test.Test
import kotlin.test.assertEquals

internal class DummyAImplTest {

    private val dummyA = DummyAImpl()

    @Test
    fun `dummyA must return A`() {
        assertEquals("A", dummyA.dummyA())
    }

}