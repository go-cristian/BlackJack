import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Player {

  private final Deck deck;
  private List<Integer> cards = new ArrayList<>();
  private boolean playable = true;
  private int value = 0;

  Player(Deck deck) {
    this.deck = deck;
  }

  String currentHand() {
    return cards.toString() + " - " + value;
  }

  void hit() throws IOException {
    int value = deck.next();
    cards.add(value);
    this.value += value;
    if (this.value > 21) {
      throw new IOException("");
    }
  }

  void stand() {
    playable = false;
  }

  boolean playable() {
    return playable;
  }

  void deal(Collection<Integer> hand) {
    for (Integer value : hand) {
      cards.add(value);
      this.value += value;
    }
  }

  int value() {
    return value;
  }
}