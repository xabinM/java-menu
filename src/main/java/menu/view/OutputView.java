package menu.view;

public class OutputView {
    private static final String START_RECOMMEND_LUNCH = "점심 메뉴 추천을 시작합니다.";
    private static final String REQUEST_COACHES_NAME = "코치의 이름을 입력해 주세요. (, 로 구분)";
    private static final String REQUEST_CANT_EAT_MENU = "(이)가 못 먹는 메뉴를 입력해 주세요.";
    private static final String PRINT_RESULT_MESSAGE = "메뉴 추천 결과입니다.";
    private static final String PRINT_SEPARATE_BY_DAY_MESSAGE = "[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]";

    public static void printMenuRecommendStart() {
        System.out.println(START_RECOMMEND_LUNCH);
    }

    public static void printRequestCoachName() {
        System.out.println(REQUEST_COACHES_NAME);
    }

    public static void printRequestCantEatMenu(String name) {
        System.out.printf("%s" + REQUEST_CANT_EAT_MENU, name);
    }

    public static void printResultMessage() {
        System.out.println(PRINT_RESULT_MESSAGE);
    }

    public static void printSeparationPartByDay() {
        System.out.println(PRINT_SEPARATE_BY_DAY_MESSAGE);
    }
}
