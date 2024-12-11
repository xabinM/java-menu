package menu.controller;

import menu.generator.DailyCategoryGenerator;
import menu.model.Coach;
import menu.service.MenuPicker;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class MenuRecommender {
    private final List<String> dailyCategory;

    public MenuRecommender() {
        this.dailyCategory = new DailyCategoryGenerator().generateDailyCategory();
    }

    public void runMenu() {
        List<Coach> coaches = initializeCoaches();
        printResult(coaches);
    }

    private List<Coach> initializeCoaches() {
        OutputView.printMenuRecommendStart();
        String[] coachNames = processRequestCoachName();
        List<Coach> coaches = new ArrayList<>();
        for (String coachName : coachNames) {
            coaches.add(processRequestCantEatMenu(coachName));
        }
        return coaches;
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

    private Coach processRequestCantEatMenu(String coachName) {
        while (true){
            try {
                OutputView.printRequestCantEatMenu(coachName);
                String[] cantEatMenus = InputView.requestCantEatMenu();
                return createCoach(coachName, cantEatMenus);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private Coach createCoach(String coachName, String[] cantEatMenus) {
        return new Coach(coachName, cantEatMenus);
    }

    private void printResult(List<Coach> coaches) {
        OutputView.printResultMessage();
        OutputView.printSeparationPartByDay();
        OutputView.printDailyCategory(dailyCategory);
        for (Coach coach : coaches) {
            List<String> resultMenu = new MenuPicker().createMenuEachCategory(coach, dailyCategory);
            OutputView.printRecommendationResult(coach.combineNameWithMenu(resultMenu));
        }
        OutputView.printRecommendationCompleteMessage();
    }
}
