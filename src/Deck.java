import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

final class Deck {

  private final Random random = new Random();

  Deck() {
  }

  public Collection<Integer> hand() {
    List<Integer> hand = new ArrayList<>(2);
    hand.add(next());
    hand.add(next());
    return hand;
  }

  public int next() {
    return random.nextInt(9) + 2;
  }
}