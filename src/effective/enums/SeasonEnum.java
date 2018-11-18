package effective.enums;

/**
 * @author Ji YongGuang.
 * @date 15:41 2018/11/16.
 */
public enum SeasonEnum {

    SPRING(1,"春天"),
    SUMMER(2,"夏天"),
    AUTUMN(3,"秋天"),
    WINTER(4,"冬天");

    public int code;
    public String msg;

    SeasonEnum(int i, String 春天) {
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
