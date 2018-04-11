package deprecated;

import java.util.ArrayList;
import java.util.List;

class Hand {

  private final Rules rules;

  private List<Card> cards = new ArrayList<>();

  Hand(Rules rules) {
    this.rules = rules;
  }

  int size() {
    return cards.size();
  }

  void add(Card card) {
    cards.add(card);
  }

  int value() {
    int value = 0;
    for (Card card : cards) {
      value += rules.valueOf(card);
    }
    return value;
  }
}