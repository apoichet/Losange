package com.ouiscnf.gremlins.kata.losange.domain;

import static java.lang.String.valueOf;

import org.apache.commons.lang3.StringUtils;

public class Sequence {

  private Alphabet firstLetter;
  private int nbrSpaceBetweenLetter;
  private String secondLetter;

  public Sequence(Alphabet firstLetter) {
    this.firstLetter = firstLetter;
    this.nbrSpaceBetweenLetter = (firstLetter.getPosition()-2)*2+1;
    this.secondLetter = !Alphabet.A.equals(firstLetter) ? valueOf(firstLetter) : StringUtils.EMPTY;
  }

  public String getSequence(){
    StringBuilder sb = new StringBuilder(valueOf(this.firstLetter.getLetter()));
    String spaceBetweenLetter = transform(nbrSpaceBetweenLetter);
    sb.append(spaceBetweenLetter);
    sb.append(this.secondLetter);
    return sb.toString();
  }
  
  private String transform(Integer integer){
    StringBuilder sb = new StringBuilder();
    for (Integer i = 0; i < integer; i++) {
       sb.append(' ');
    }
    return sb.toString();
  }

}
