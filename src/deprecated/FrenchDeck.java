package deprecated;

import java.util.Stack;

class FrenchDeck implements Deck {

  private static final Stack<Card> cards = new Stack<>();

  FrenchDeck() {
    addAll();
  }

  @Override public Card next() {
    return cards.pop();
  }

  private void addAll() {
    addSuitCards(FrenchSuit.SPADES);
    addSuitCards(FrenchSuit.HEARTS);
    addSuitCards(FrenchSuit.DIAMONDS);
    addSuitCards(FrenchSuit.CLUBS);
  }

  private void addSuitCards(FrenchSuit suits) {
    cards.add(new FrenchCard("2", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("3", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("4", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("5", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("6", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("7", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("8", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("9", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("10", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("Jack", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("Queen", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("King", FrenchSuit.CLUBS));
    cards.add(new FrenchCard("Ace", FrenchSuit.CLUBS));
  }
}