import java.io.IOException;

class BlackJack {

  private final Deck deck;
  private Player dealer;
  private Player player;
  private Player winner;

  BlackJack(Deck deck) {
    this.deck = deck;
    dealer = new Player(deck);
  }

  void join(Player player) {
    this.player = player;
  }

  boolean playable() {
    return player.playable();
  }

  boolean winner() {
    if (winner == null) {
      if (dealer.value() < player.value()) {
        winner = player;
      } else {
        winner = dealer;
      }
    }
    return winner.equals(player);
  }

  void start() {
    player.deal(deck.hand());
    dealer.deal(deck.hand());
  }

  boolean isLower() {
    return dealer.value() < player.value();
  }

  void next() throws IOException {
    dealer.hit();
  }

  String currentHand() {
    return dealer.currentHand();
  }

  void lose() {
    winner = player;
  }
}