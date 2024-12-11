package menu.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coach {
    private final String name;
    private final String[] cantEatFoods;

    public Coach(String name, String[] cantEatFoods) {
        this.name = name;
        this.cantEatFoods = cantEatFoods;
    }

    public boolean checkIsContainCantEatMenu(String menu) {
        return !Arrays.asList(cantEatFoods).contains(menu);
    }

    public List<String> combineNameWithMenu(List<String> menus) {
        List<String> result = new ArrayList<>();
        result.add(name);
        result.addAll(menus);
        return result;
    }
}
