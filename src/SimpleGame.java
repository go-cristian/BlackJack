import java.io.IOException;
import java.util.Scanner;

class SimpleGame {

  public static void main(String... args) {

    Scanner scanner = new Scanner(System.in);

    Deck deck = new Deck();
    Player player = new Player(deck);
    BlackJack game = new BlackJack(deck);
    game.join(player);
    game.start();

    System.out.println("CPU game is: ");
    System.out.println(game.currentHand());

    while (game.playable()) {
      System.out.println("Your current game is: ");
      System.out.println(player.currentHand());
      System.out.println("Select an option:/n1) Hit/n2) Stand/n");
      int option = scanner.nextInt();
      switch (option) {
        case 1:
          System.out.println("You requested one card.");
          try {
            player.hit();
          } catch (IOException e) {
            player.stand();
          }
          break;
        case 2:
          System.out.println("You requested to stand.");
          player.stand();
          break;
      }
    }

    while (game.isLower()) {
      System.out.println("CPU Requested a card.");
      try {
        game.next();
      } catch (IOException e) {
        game.lose();
      }
    }

    System.out.println("CPU game is: ");
    System.out.println(game.currentHand());

    if (game.winner()) {
      System.out.println("You are the winner");
    } else {
      System.out.println("You loose");
    }
  }
}
