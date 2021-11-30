package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.assertj.core.internal.bytebuddy.implementation.bytecode.Addition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void simple_addition() {assertEquals(5, new Sample().op(Sample.Operation.ADD,2,3));}

    @Test
    void simple_multiplication() {assertEquals(8, new Sample().op(Sample.Operation.MULT,2,4));}

    @Test
    void fact_Should_Produce_IllegalArgumentException()
    {
        int number = -2;
        org.assertj.core.api.Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Sample().fact(number)).withMessage("N should be possitive");
    }

}
