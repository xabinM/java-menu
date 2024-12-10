package menu.exception;

public enum Exception {
    INVALID_NAME_LENGTH("코치 이름은 2글자 이상 4글자 이하만 가능합니다."),
    INVALID_NAME_COUNT("코치는 최소 2명, 최대 5명까지 식사를 함께 합니다."),
    INVALID_CANT_EAT_MENU_COUNT("못 먹는 메뉴는 최소 0개, 최대 2개만 입력해주세요."),
    INVALID_RIGHT_CANT_EAT_MENU_NAME("올바른 못 먹는 메뉴 이름을 입력해 주세요")
    ;

    private final String message;
    private static final String PREFIX = "[ERROR] ";

    Exception(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
