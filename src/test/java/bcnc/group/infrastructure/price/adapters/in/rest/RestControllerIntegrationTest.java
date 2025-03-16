package bcnc.group.infrastructure.price.adapters.in.rest;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class RestControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetPriceByProductBrandAndDate_NotFound() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/prices/35455/2/2020-06-14T10:00:00Z"))
                .andExpect(MockMvcResultMatchers.status().isNotFound());
    }

    @ParameterizedTest
    @MethodSource("testGetPriceByProductBrandAndDateProvider")
    void testGetPriceByProductBrandAndDate(Long productId, Long brandId, String date, String expectedPrice)
            throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/prices/" + productId + "/" + brandId + "/" + date))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(expectedPrice));
    }

    private static Stream<Arguments> testGetPriceByProductBrandAndDateProvider() {
        return Stream.of(Arguments.of(35455L, 1L, "2020-06-14T10:00:00Z", "35.5"),
                Arguments.of(35455L, 1L, "2020-06-14T16:00:00Z", "25.45"),
                Arguments.of(35455L, 1L, "2020-06-14T21:00:00Z", "35.5"),
                Arguments.of(35455L, 1L, "2020-06-15T10:00:00Z", "30.5"),
                Arguments.of(35455L, 1L, "2020-06-16T21:00:00Z", "38.95"));
    }
}
