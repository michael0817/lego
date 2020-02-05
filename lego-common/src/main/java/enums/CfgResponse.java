package enums;

import lombok.Getter;

public enum CfgResponse {

    SUCCESS("000000","SUCCESS","成功"),
    ABORT("900000","ABORT","退出"),
    SYSTEM_ERROR("900101","SYSTEM_ERROR","系统错误"),
    SYSETM_BUSY("900102","SYSTEM_BUSY","系统繁忙"),
    VALID_DATA_ERROR("900103","VALID_DATA_ERROR","数据校验不通过"),
    REQUEST_TIMEOUT_ERROR("900104","REQUEST_TIMEOUT_ERROR","请求超时");

    @Getter
    public final String en;
    @Getter
    public final String cn;
    @Getter
    public final String code;

    CfgResponse(final String code, final String en, final String cn){
        this.code=code;
        this.en=en;
        this.cn=cn;
    }

}
