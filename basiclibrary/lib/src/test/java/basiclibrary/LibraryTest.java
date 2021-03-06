/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void testInRollFunction() {
        Basiclibrary classUnderTest = new Basiclibrary();
        int[] actualResult = classUnderTest.roll(3);
        int length = actualResult.length;
        assertEquals(3, length);
    }

    @Test
    void testInContainsDuplicates() {
        Basiclibrary classUnderTest = new Basiclibrary();
        int[] arr = {1, 2, 3, 4};
        boolean actualResult = classUnderTest.containsDuplicates(arr);
        assertEquals(true, actualResult);
    }

    @Test
    void testInCalculatingAverages() {
        Basiclibrary classUnderTest = new Basiclibrary();
        int[] testArray = {1, 2, 3, 4, 5};
        float actualResult = (float) classUnderTest.calculatingAverages(testArray);
        assertEquals(3.0, actualResult);
    }

    @Test
    void testInArrayOfArrays() {
        Basiclibrary classUnderTest = new Basiclibrary();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] actualResult = classUnderTest.arrayOfArrays(weeklyMonthTemperatures);
        int[] arr = {55, 54, 60, 53, 59, 57, 61};
        assertArrayEquals(arr, actualResult);
    }

    @Test
    void testInUniqueTemp() {
        Basiclibrary classUnderTest = new Basiclibrary();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        ArrayList actualResult = classUnderTest.uniqueTemp(weeklyMonthTemperatures);
        ArrayList<String> str = new ArrayList<String>();
        str.add("High: " + 72);
        str.add("Low: " + 51);
        str.add("Never saw temperature: " + 63);
        str.add("Never saw temperature: " + 67);
        str.add("Never saw temperature: " + 68);
        str.add("Never saw temperature: " + 69);
        assertLinesMatch(str, actualResult);


    }

    @Test
    void testInTally() {
        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        Basiclibrary classUnderTest = new Basiclibrary();
        String actualResult = classUnderTest.tally(votes);
        assertEquals("Bush", actualResult);
    }
}