package com.leyou.common.exception;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author ren.xm
 * @create 2019-08-26 22:51
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class LyExcetion extends RuntimeException{

    private ExceptionEnum exceptionEnum;
}
