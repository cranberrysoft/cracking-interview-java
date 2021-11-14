package chapter1.task_1_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isUniqueWhenEmpty() {
        var empty = "";

        final boolean unique = new Solution().isUnique(empty);

        assertTrue(unique);
    }

    @Test
    void isNotUniqueWhenManyEmptySpaces() {
        var empty = "    ";

        final boolean unique = new Solution().isUnique(empty);

        assertFalse(unique);
    }

    @Test
    void isUniqueForOneLetter() {
        var empty = "a";

        final boolean unique = new Solution().isUnique(empty);

        assertTrue(unique);
    }

    @Test
    void isUniqueForTwoLetters() {
        var empty = "ab";

        final boolean unique = new Solution().isUnique(empty);

        assertTrue(unique);
    }


    @Test
    void isNotUniqueForTwoTheSameLetters() {
        var empty = "aa";

        final boolean unique = new Solution().isUnique(empty);

        assertFalse(unique);
    }

    @Test
    void isNotUniqueForTwoTheSameLettersAndOneOther() {
        var empty = "aab";

        final boolean unique = new Solution().isUnique(empty);

        assertFalse(unique);
    }
}