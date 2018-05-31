package com.ouiscnf.gremlins.kata.losange.domain;

import static java.lang.String.valueOf;
import static java.util.stream.IntStream.rangeClosed;

import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

/**
 * Cette classe represente le coeur du losange.
 * Soit la partie entre les lettres (lettres incluses).
 */
public class Core {

  private Alphabet letter;
  private int nbrSpaceBetweenLetter;
  private String secondLetter;

  public Core(Alphabet letter) {
    this.letter = letter;
    this.nbrSpaceBetweenLetter = (letter.getPosition()-2)*2+1;
    this.secondLetter = Alphabet.A.equals(letter) ? StringUtils.EMPTY : valueOf(letter);
  }

  public String buildDisplay(){
    StringBuilder sb = new StringBuilder(valueOf(this.letter.getLetter()));

    String spaceBetweenLetter = rangeClosed(1, nbrSpaceBetweenLetter)
      .boxed()
      .map(n -> " ")
      .collect(Collectors.joining());

    sb.append(spaceBetweenLetter);
    sb.append(this.secondLetter);

    return sb.toString();
  }

}
