package menu.generator;

import camp.nextstep.edu.missionutils.Randoms;
import menu.model.MenuCategory;

import java.util.ArrayList;
import java.util.List;

public class DailyCategoryGenerator {
    public List<String> generateDailyCategory() {
        List<String> categoryNames = MenuCategory.getCategoryNames();

        return pickRandomCategory(categoryNames);
    }

    private List<String> pickRandomCategory(List<String> categoryNames) {
        List<String> result;
        do {
            result = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                result.add(categoryNames.get(Randoms.pickNumberInRange(0, 4)));
            }
        } while (checkDuplicationCategoryName(result));

        return result;
    }

    private boolean checkDuplicationCategoryName(List<String> categoryNames) {
        for (String categoryName : categoryNames) {
            if (countDuplication(categoryNames, categoryName) >= 3) {
                return true;
            }
        }
        return false;
    }

    private long countDuplication(List<String> categoryNames, String target) {
        return categoryNames.stream()
                .filter(categoryName -> categoryName.equals(target)).count();
    }
}
