package cn.sp;

public enum ResultCode {
    SUCCESS(200, "success"),
    BAD_REQUEST(400, "bad request"),
    NOT_FOUND(404, "not found"),
    SYSTEM_ERROR(500, "system error");

    private int code;
    private String desc;

    ResultCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
