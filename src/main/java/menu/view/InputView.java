package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String[] requestCoachName() {
        String input = Console.readLine();
        return splitInput(input.trim());
    }

    public static String[] requestCantEatMenu() {
        String input = Console.readLine();
        return splitInput(input.trim());
    }

    private static String[] splitInput(String input) {
        return input.split(",");
    }
}
