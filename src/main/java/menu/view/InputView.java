package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.validator.CantEatMenuValidator;
import menu.validator.CoachNameValidator;

public class InputView {
    private static final String DELIMITER = ",";

    public static String[] requestCoachName() {
        String input = Console.readLine();
        String[] coachNames = splitInput(input.trim());

        CoachNameValidator.validateName(coachNames);

        return coachNames;
    }

    public static String[] requestCantEatMenu() {
        String input = Console.readLine();
        String[] cantEatMenus =  splitInput(input.trim());

        CantEatMenuValidator.validateCantEatMenu(cantEatMenus);

        return cantEatMenus;
    }

    private static String[] splitInput(String input) {
        return input.split(DELIMITER);
    }
}
