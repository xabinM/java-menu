package menu.validator;

import menu.exception.Exception;

public class CoachNameValidator {
    public static void validateName(String[] coachNames) {
        validateNameLength(coachNames);
        validateNameCount(coachNames);
    }

    private static void validateNameLength(String[] coachNames) {
        for (String coachName : coachNames) {
            if (coachName.length() > 4 || coachName.length() < 2) {
                throw new IllegalArgumentException(
                        Exception.INVALID_NAME_LENGTH.getMessage()
                );
            }
        }
    }

    private static void validateNameCount(String[] coachNames) {
        if (coachNames.length > 5 || coachNames.length < 2) {
            throw new IllegalArgumentException(
                    Exception.INVALID_NAME_COUNT.getMessage()
            );
        }
    }
}
