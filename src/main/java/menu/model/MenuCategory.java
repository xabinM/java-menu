package menu.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MenuCategory {
    JAPANESE("일식", List.of("규동", "우동", "미소시루", "스시", "가츠동", "오니기리", "하이라이스", "라멘", "오코노미야끼")),
    KOREAN("한식", List.of("김밥", "김치찌개", "쌈밥", "된장찌개", "비빔밥", "칼국수", "불고기", "떡볶이", "제육볶음")),
    CHINESE("중식", List.of("깐풍기", "볶음면", "동파육", "짜장면", "짬뽕", "마파두부", "탕수육", "토마토 달걀볶음", "고추잡채")),
    ASIAN("아시안", List.of("팟타이", "카오 팟", "나시고렝", "파인애플 볶음밥", "쌀국수", "똠얌꿍", "반미", "월남쌈", "분짜")),
    WESTERN("양식", List.of("라자냐", "그라탱", "뇨끼", "끼슈", "프렌치 토스트", "바게트", "스파게티", "피자", "파니니"));

    private final String categoryName;
    private final List<String> menuItems;

    MenuCategory(String categoryName, List<String> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }

    // static이 쓰인 이유
    // 보통 enum 클래스는 MenuCategory.JAPANESE.~() 방식으로 사용해왔지만
    // 이 메서드같은경우는 특정 인스턴스와 관련없이 모든 인스턴스의 이름을 뽑아오기 때문에 static 사용
    public static List<String> getCategoryNames() {
        return Stream.of(MenuCategory.values())
                .map(category -> category.categoryName)
                .collect(Collectors.toList());
    }

    public static List<String> getAllMenuItems() {
        return Stream.of(MenuCategory.values())
                .flatMap(category -> category.menuItems.stream())
                .collect(Collectors.toList());
    }
}
