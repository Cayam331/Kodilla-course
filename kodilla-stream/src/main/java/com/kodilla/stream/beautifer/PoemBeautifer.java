package com.kodilla.stream.beautifer;

public class PoemBeautifer {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorator(text);
        System.out.println(result);

    }
}
