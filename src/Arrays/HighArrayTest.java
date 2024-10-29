package Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighArrayTest {

    HighArray highArray;

    @BeforeEach
    void init() {
        highArray = new HighArray(10);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 10})
    void insertTest(int n) {
    }

    @Test
    void find() {
    }

    @Test
    void remove() {
    }

    @Test
    void print() {
    }

    @Test
    void sizeArray() {
        highArray = new HighArray(20);
        assertEquals(20, highArray.sizeArray());
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
    }
}