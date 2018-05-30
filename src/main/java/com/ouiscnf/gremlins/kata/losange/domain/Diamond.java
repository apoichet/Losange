package com.ouiscnf.gremlins.kata.losange.domain;

import java.util.ArrayList;
import java.util.List;

public class Diamond {

  private Alphabet inputLetter;

  public Diamond(Alphabet inputLetter) {
    this.inputLetter = inputLetter;
  }

  public List<String> buildDiamondLines() {

    List<String> diamondLines = new ArrayList<>();
    int letterPosition = this.inputLetter.getPosition();

    for (int i = 1; i <= letterPosition; i++) {
      String spaceBetweenSequence = transform(letterPosition - i);

      Sequence sequence = new Sequence(Alphabet.valueOf(i));

      String diamondLine = spaceBetweenSequence + sequence.getSequence() + spaceBetweenSequence;

      diamondLines.add(diamondLine);
    }

    for (int i = letterPosition - 1; i >= 1; i--) {
      String spaceBetweenSequence = transform(letterPosition - i);

      Sequence sequence = new Sequence(Alphabet.valueOf(i));

      String diamondLine = spaceBetweenSequence + sequence.getSequence() + spaceBetweenSequence;

      diamondLines.add(diamondLine);
    }

    return diamondLines;
  }

  private String transform(Integer integer) {
    StringBuilder sb = new StringBuilder();
    for (Integer i = 0; i < integer; i++) {
      sb.append(' ');
    }
    return sb.toString();
  }
}
