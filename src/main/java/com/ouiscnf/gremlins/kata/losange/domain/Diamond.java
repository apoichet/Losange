package com.ouiscnf.gremlins.kata.losange.domain;

import static java.util.stream.IntStream.rangeClosed;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Diamond {

  private Alphabet inputLetter;

  public Diamond(Alphabet inputLetter) {
    this.inputLetter = inputLetter;
  }

  public List<String> buildDiamondDisplay() {

    List<String> diamondLines = new ArrayList<>();
    int inputLetterPosition = this.inputLetter.getPosition();

    //On construit le haut du losange
    for (int letterPosition = 1; letterPosition < inputLetterPosition; letterPosition++) {

      diamondLines.add(buildDiamondLine(inputLetterPosition, letterPosition));
      
    }

    //On construit la ligne du milieu
    diamondLines.add(buildDiamondLine(inputLetterPosition, inputLetterPosition));

    //On construit le bas du losange
    for (int letterPosition = inputLetterPosition - 1; letterPosition >= 1; letterPosition--) {

      diamondLines.add(buildDiamondLine(inputLetterPosition, letterPosition));

    }

    return diamondLines;
  }

  private String buildDiamondLine(int inputLetterPosition, int letterPosition) {
    String spaceBetweenCore = mapToStrSpace(inputLetterPosition - letterPosition);
    Core core = new Core(Alphabet.valueOf(letterPosition));
    return spaceBetweenCore + core.buildDisplay() + spaceBetweenCore;
  }

  private String mapToStrSpace(Integer integer) {
    return rangeClosed(1, integer)
      .boxed()
      .map(n -> " ")
      .collect(Collectors.joining());
  }
}
