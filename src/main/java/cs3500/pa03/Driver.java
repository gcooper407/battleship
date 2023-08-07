package cs3500.pa03;

import cs3500.pa03.controller.Controller;
import cs3500.pa03.controller.GameController;
import cs3500.pa03.model.BotPlayer;
import cs3500.pa03.model.GameModel;
import cs3500.pa03.model.HumanPlayer;
import cs3500.pa03.model.Model;
import cs3500.pa03.model.Player;
import cs3500.pa03.view.GameView;
import cs3500.pa03.view.View;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * This is the main driver of this project.
 */
public class Driver {
  /**
   * Project entry point
   *
   * @param args - no command line args required
   */
  public static void main(String[] args) {
    View view = new GameView(System.out, new InputStreamReader(System.in));
    Model model = new GameModel();

    Controller controller = new GameController(view, model, new Random(1));
    controller.run();
  }
}