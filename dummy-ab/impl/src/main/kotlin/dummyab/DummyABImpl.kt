package dummyab

import dummya.DummyA
import dummyb.DummyB

class DummyABImpl(private val dummyA: DummyA, private val dummyB: DummyB) : DummyAB {
    override fun ab() = "${dummyA.a()}:${dummyB.b()}"
}