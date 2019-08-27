package com.leyou.common.advice;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyExcetion;
import com.leyou.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author ren.xm
 * @create 2019-08-25 11:15
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(LyExcetion.class)
    public ResponseEntity<ExceptionResult> handleException(LyExcetion e){
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
