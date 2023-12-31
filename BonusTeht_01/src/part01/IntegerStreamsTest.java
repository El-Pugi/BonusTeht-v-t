package part01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

class IntegerStreamsTest {

	IntegerStreams solution = new IntegerStreams();
	@Test
	void testNumbersBetween() {
        IntStream numbersBetween = solution.numbersBetween(10, 100);

        assertNotNull(numbersBetween, "numbersBetween must return a stream");

        // convert the stream into a list for easier testing
        List<Integer> numbers = numbersBetween.boxed().toList();

        // check that the numbers are correct
        assertEquals(91, numbers.size());
        assertEquals(10, numbers.get(0));
        assertEquals(100, numbers.get(90));
	}

	@Test
	void testSum() {
	     IntStream numbers = IntStream.of(10, 20, 12);

	     assertEquals(42, solution.sum(numbers), "sum method must return the sum of values in the stream");
	}

	@Test
	void testCountNumbersInStream() {
        IntStream numbers = IntStream.of(10, 20, 12);

        // check that the size of the stream is correct
        assertEquals(3, solution.countNumbersInStream(numbers));

        // check that the method works with an empty stream
        assertEquals(0, solution.countNumbersInStream(IntStream.empty()));
	}

}
