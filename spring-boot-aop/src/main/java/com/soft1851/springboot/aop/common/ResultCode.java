package com.soft1851.springboot.aop.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wl
 * @ClassNameasdsda
 * @Description TODO
 * @Date 2020/1/1
 * @Version 1.0
 */

public enum ResultCode {
    /* 成功状态码 */
    SUCCESS(20000, "成功"),

    /* 用户错误：200001-29999*/

    USER_NOT_SIGN_IN(200001, "用户未登录"),
    USER_PASSWORD_ERROR(200002, "密码错误"),
    USER_NOT_EXIST(200003, "请登录正确用户"),
    USER_ACCOUNT_NOT_EXIST(200004,"账号不存在"),
    USER_NOT_IMPORT_MOBILE(200005,"输入手机号不能为空"),
    USER_LOGIN_FAILURE(200007,"登录失效"),
    USER_PASSWORD_SAME_ERROR(200012, "密码不一致"),
    USER_EXIST(200013, "用户已存在"),
    NOT_LOGIN(200014, "请先登录"),
    PASSWORD_IS_NULL(200015, "密码不能为空"),


    /*token错误*/

    TOKEN_NOT_EXIT(200008,"TOKEN未添加"),
    TOKEN_ERROR(200009,"TOKEN错误"),
    TOKEN_TIME_ERROR(20010,"TOKEN已超时"),
    TOKEN_STATUS_ERROR(20011,"TOKEN状态被禁用"),





    /* 业务错误：30001-39999 */
    SPECIFIED_QUESTIONED_USER_NOT_EXIST(30001, "某业务出现问题"),

    /* 系统错误：40001-49999 */
    SYSTEM_INNER_ERROR(40001, "系统繁忙，请稍后重试"),

    /* 数据错误：50001-599999 */
    RESULT_CODE_DATA_NONE(50001, "数据未找到"),
    DATA_IS_WRONG(50002, "数据有误"),
    DATA_ALREADY_EXISTED(50003, "数据已存在"),

    /* 接口错误：60001-69999 */
    INTERFACE_INNER_INVOKE_ERROR(60001, "内部系统接口调用异常"),
    INTERFACE_OUTER_INVOKE_ERROR(60002, "外部系统接口调用异常"),
    INTERFACE_FORBID_VISIT(60003, "该接口禁止访问"),
    INTERFACE_ADDRESS_INVALID(60004, "接口地址无效"),
    INTERFACE_REQUEST_TIMEOUT(60005, "接口请求超时"),
    INTERFACE_EXCEED_LOAD(60006, "接口负载过高"),

    /* 权限错误：70001-79999 */
    PERMISSION_NO_ACCESS(70001, "无访问权限");

    private Integer code;

    private String message;

    ResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public static String getMessage(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.message;
            }
        }
        return name;
    }

    public static Integer getCode(String name) {
        for (ResultCode item : ResultCode.values()) {
            if (item.name().equals(name)) {
                return item.code;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.name();
    }


    /**
     * 校验重复的code值
     *
     * @param args
     */
    public static void main(String[] args) {
        ResultCode[] ApiResultCodes = ResultCode.values();
        List<Integer> codeList = new ArrayList<Integer>();
        for (ResultCode ApiResultCode : ApiResultCodes) {
            if (codeList.contains(ApiResultCode.code)) {
                System.out.println(ApiResultCode.code);
            } else {
                codeList.add(ApiResultCode.code());
            }
        }
    }
}