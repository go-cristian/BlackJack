package deprecated;

final class Dealer {

  private final Deck deck;
  private final Rules rules;

  Dealer() {
    this(
        new FrenchDeck(),
        new BlackJackRules()
    );
  }

  Dealer(Deck deck, Rules rules) {
    this.deck = deck;
    this.rules = rules;
  }

  Hand hand() {
    Hand hand = new Hand(rules);
    hand.add(hit());
    hand.add(hit());
    return hand;
  }

  Card hit() {
    return deck.next();
  }
}