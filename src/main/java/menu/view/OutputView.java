package menu.view;

public class OutputView {
    public static void printMenuRecommendStart() {
        System.out.println("점심 메뉴 추천을 시작합니다.");
    }

    public static void printRequestCoachName() {
        System.out.println("코치의 이름을 입력해 주세요. (, 로 구분)");
    }

    public static void printRequestCantEatMenu(String name) {
        System.out.printf("%s(이)가 못 먹는 메뉴를 입력해 주세요.", name);
    }
}
