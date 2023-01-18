package com.bridgelabz.moodanalyzer;

import com.bridgelabz.mood_analyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSadMood() {
        MoodAnalyzer obj = new MoodAnalyzer("I am in sad mood");
        String mood = obj.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenSad_shouldReturnHappyMood() {
        MoodAnalyzer obj = new MoodAnalyzer("i am in happy mood");
        String mood = obj.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
