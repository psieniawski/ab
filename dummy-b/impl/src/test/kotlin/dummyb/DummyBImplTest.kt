package dummyb

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DummyBImplTest {
    private val dummyB = DummyBImpl()

    @Test
    fun b() {
        assertThat(dummyB.b()).isEqualTo("BB")
    }
}