import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordsTest {

    @Test
    void spinWords() {
        assertEquals("Hi", new SpinWords().spinWords("Hi"));
        assertEquals("olleH", new SpinWords().spinWords("Hello"));
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
        assertEquals("I went to the erots", new SpinWords().spinWords("I went to the store"));
    }
}