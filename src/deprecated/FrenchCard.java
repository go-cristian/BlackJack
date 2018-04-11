package deprecated;

class FrenchCard implements Card {

  static final String TWO = "2";
  static final String THREE = "3";
  static final String FOUR = "4";
  static final String FIVE = "5";
  static final String SIX = "6";
  static final String SEVEN = "7";
  static final String EIGTH = "8";
  static final String NINE = "9";
  static final String TEN = "10";
  static final String JACK = "JACK";
  static final String QUEEN = "Queen";
  static final String KING = "King";
  static final String ACE = "Ace";

  private final String name;
  private final FrenchSuit suit;

  FrenchCard(String name, FrenchSuit suit) {
    this.name = name;
    this.suit = suit;
  }

  @Override public String name() {
    return name;
  }

  @Override public Suit suit() {
    return suit;
  }
}
