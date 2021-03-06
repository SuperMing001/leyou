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
    CATEGORY_LIST_IS_NULL(200, "数据为空！"),
    BRAND_SAVE_ERROR(500, "新增品牌失败！"),
    BRAND_NOT_FOUND(400, "品牌分类没查到！"),
    UPLOAD_FILE_ERROR(500, "文件上传失败！"),
    INVALID_FILE_TYPE(500, "无效的文件类型！"),
    ;
    private int code;
    private String msg;
}
