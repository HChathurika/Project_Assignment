package temperature;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private TemperatureConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    void fahrenheitToCelsius_shouldConvertCorrectly() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.0001);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.0001);
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40), 0.0001);
    }

    @Test
    void celsiusToFahrenheit_shouldConvertCorrectly() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.0001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.0001);
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40), 0.0001);
    }

    @Test
    void isExtremeTemperature_shouldDetectExtremeCorrectly() {
        assertTrue(converter.isExtremeTemperature(-41));
        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(0));
        assertFalse(converter.isExtremeTemperature(50));
        assertTrue(converter.isExtremeTemperature(51));
    }
}
