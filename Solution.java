import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution {

    public static void reverseWords(char[] message) {

        // decode the message by reversing the words
        System.out.println("input");
        System.out.println(Arrays.toString(message));

        reverse(message, 0, message.length - 1);
        
        System.out.println("reverse entire message");
        System.out.println(Arrays.toString(message));

        int start = 0;
        int end = 0;
        
        for (int i = 0; i < message.length; i++) {
            
            if (message[i] == ' ') {
                end = i - 1;
                reverse(message, start, end);
                start = i + 1;
            }
        }
        reverse(message, start, message.length - 1);
        
        System.out.println("decoded message");
        System.out.println(Arrays.toString(message));
        System.out.println();
    }

    public static void reverse(char[] word, int left, int right) {
        
        if (left < 0 || right > word.length - 1) {
            System.out.println("Error: bad input given to reverse()");
            return;
        }
        
        while (left < right) {
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }
    }

    















    // tests

    @Test
    public void oneWordTest() {
        final char[] expected = "vault".toCharArray();
        final char[] actual = "vault".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoWordsTest() {
        final char[] expected = "cake thief".toCharArray();
        final char[] actual = "thief cake".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void threeWordsTest() {
        final char[] expected = "get another one".toCharArray();
        final char[] actual = "one another get".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void multipleWordsSameLengthTest() {
        final char[] expected = "the cat ate the rat".toCharArray();
        final char[] actual = "rat the ate cat the".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void multipleWordsDifferentLengthsTest() {
        final char[] expected = "chocolate bundt cake is yummy".toCharArray();
        final char[] actual = "yummy is cake bundt chocolate".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void emptyStringTest() {
        final char[] expected = "".toCharArray();
        final char[] actual = "".toCharArray();
        reverseWords(actual);
        assertArrayEquals(expected, actual);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}