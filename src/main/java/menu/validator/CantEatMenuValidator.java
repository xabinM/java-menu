package menu.validator;

import menu.exception.Exception;
import menu.model.MenuCategory;

public class CantEatMenuValidator {
    public static void validateCantEatMenu(String[] cantEatMenus) {
        validateCantEatMenuCount(cantEatMenus);
        validateRightCantEatMenu(cantEatMenus);
    }

    private static void validateCantEatMenuCount(String[] cantEatMenus) {
        if (cantEatMenus.length > 2) {
            throw new IllegalArgumentException(
                    Exception.INVALID_CANT_EAT_MENU_COUNT.getMessage()
            );
        }
    }

    private static void validateRightCantEatMenu(String[] cantEatMenus) {
        for (String cantEatMenu : cantEatMenus) {
            if (!MenuCategory.getAllMenuItems().contains(cantEatMenu) && !cantEatMenu.isEmpty()) {
                throw new IllegalArgumentException(
                        Exception.INVALID_RIGHT_CANT_EAT_MENU_NAME.getMessage()
                );
            }
        }
    }
}
