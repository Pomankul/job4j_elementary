package ru.job4j.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvetrt140RblThen2Euro() {
        float in = 140;
        float excepted = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(excepted, withPrecision(eps));
    }

    @Test
    void whenConvert180RblThen3Dlr() {
        float in = 180;
        float excepted = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(excepted, withPrecision(eps));
    }
}