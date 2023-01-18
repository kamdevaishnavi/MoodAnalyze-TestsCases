package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        }
        return "HAPPY";
    }
}
