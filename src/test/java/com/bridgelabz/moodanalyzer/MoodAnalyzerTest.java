package com.bridgelabz.moodanalyzer;

import com.bridgelabz.mood_analyzer.MoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSadMood() {
        MoodAnalyzer obj = new MoodAnalyzer();
        String mood = obj.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }
}
