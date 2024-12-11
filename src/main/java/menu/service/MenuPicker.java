package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import menu.model.Coach;
import menu.model.MenuCategory;

import java.util.ArrayList;
import java.util.List;

public class MenuPicker {
    public List<String> createMenuEachCategory(Coach coach, List<String> dailyCategory) {
        List<String> recommendationMenu = new ArrayList<>();
        for (String categoryName : dailyCategory) {
            String menu = pickMenu(recommendationMenu, categoryName, coach);
            recommendationMenu.add(menu);
        }
        return recommendationMenu;
    }

    private String pickMenu(List<String> recommendationMenu, String categoryName, Coach coach) {
        List<String> menuItems = MenuCategory.findMenuItemsByCategoryName(categoryName);
        String menuItem = shuffleMenuItems(menuItems).get(0);
        if (validateIsCantEatMenu(coach, menuItem)
                && validateMenuDuplication(recommendationMenu, menuItem)) {
            return pickMenu(recommendationMenu, categoryName, coach);
        }
        return menuItem;
    }

    private List<String> shuffleMenuItems(List<String> menuItems) {
        return Randoms.shuffle(menuItems);
    }

    private boolean validateIsCantEatMenu(Coach coach, String menuItem) {
        return !coach.checkIsContainCantEatMenu(menuItem);
    }

    private boolean validateMenuDuplication(List<String> recommendationMenu, String menu) {
        return !recommendationMenu.contains(menu);
    }
}
