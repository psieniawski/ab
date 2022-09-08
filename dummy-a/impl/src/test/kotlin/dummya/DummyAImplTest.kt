package dummya

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DummyAImplTest {
    private val dummyA = DummyAImpl()

    @Test
    fun a() {
        assertThat(dummyA.a()).isEqualTo("A")
    }
}