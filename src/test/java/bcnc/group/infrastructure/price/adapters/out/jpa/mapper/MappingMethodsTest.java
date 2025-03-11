package bcnc.group.infrastructure.price.adapters.out.jpa.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

class MappingMethodsTest {

    MappingMethods mappingMethods = new MappingMethods();

    @Test
    void testToBrandId() {
        assertEquals(0L, mappingMethods.toBrandId(0L).getValue());
    }

    @Test
    void testToCurrency() {
        assertEquals("currency", mappingMethods.toCurrency("currency").getValue());
    }

    @Test
    void testToEndDate() {
        LocalDateTime now = LocalDateTime.now();
        assertEquals(now, mappingMethods.toEndDate(now).getValue());
    }

    @Test
    void testToPrice() {
        assertEquals(0.0, mappingMethods.toPrice(0.0).getValue());
    }

    @Test
    void testToPriceList() {
        assertEquals(0L, mappingMethods.toPriceList(0L).getValue());
    }

    @Test
    void testToPriority() {
        assertEquals(0, mappingMethods.toPriority(0).getValue());
    }

    @Test
    void testToProductId() {
        assertEquals(0L, mappingMethods.toProductId(0L).getValue());
    }

    @Test
    void testToProductPriceId() {
        assertEquals(0L, mappingMethods.toProductPriceId(0L).getValue());
    }

    @Test
    void testToStartDate() {
        LocalDateTime now = LocalDateTime.now();
        assertEquals(now, mappingMethods.toStartDate(now).getValue());
    }
}
