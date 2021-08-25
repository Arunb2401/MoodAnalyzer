package com.mood;

import java.util.Locale;

public class MoodAnalyzer {
    
     
    public String message;
    //Taking default constructor
    public MoodAnalyzer() {
    }
    //Taking parameterized constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }
    // Handling NullPointerException
    public String moodAnalyser(String message) throws MoodAnalyzerException {
        try {
            if(message.length()==0)
                throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.EMPTY,"YOU HAVE GIVEN NO INPUT,PLEASE CHECK AGAIN");
            //constant for the root locale and variant are  empty Strings
            if (message.toLowerCase(Locale.ROOT).contains("sad")) {
                return "SAD";
            }
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.NULL,"You have given NULL, PLEASE TRY AGAIN");
        }
    }
}
