package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String[] requestCoachName() {
        String input = Console.readLine();
        return splitCoachNamesByComma(input.trim());
    }

    private static String[] splitCoachNamesByComma(String input) {
        return input.split(",");
    }
}
