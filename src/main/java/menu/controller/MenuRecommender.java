package menu.controller;

import menu.view.InputView;
import menu.view.OutputView;

public class MenuRecommender {
    public void runMenu() {
        processRequestCoachName();
    }

    private String[] processRequestCoachName() {
        while (true){
            try {
                OutputView.printRequestCoachName();
                return InputView.requestCoachName();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
