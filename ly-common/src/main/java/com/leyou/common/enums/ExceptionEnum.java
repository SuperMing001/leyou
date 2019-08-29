package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author ren.xm
 * @create 2019-08-26 22:43
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    PRICE_CANNOT_BE_NULL(400, "价格不能为空!"),
    CATEGORY_LIST_IS_NULL(200, "数据为空！")
    ;
    private int code;
    private String msg;
}
