package deprecated;

class BlackJackRules implements Rules {
  @Override public int valueOf(Card card) {
    switch (card.name()) {
      case FrenchCard.TWO:
      case FrenchCard.THREE:
      case FrenchCard.FOUR:
      case FrenchCard.FIVE:
      case FrenchCard.SIX:
      case FrenchCard.SEVEN:
      case FrenchCard.EIGTH:
      case FrenchCard.NINE:
      case FrenchCard.TEN:
        return Integer.parseInt(card.name());
      case FrenchCard.JACK:
      case FrenchCard.QUEEN:
      case FrenchCard.KING:
        return 10;
      case FrenchCard.ACE:
        return 11;
    }
    return 0;
  }
}
