package net.javaguides.springboot.exception;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

// 例外処理を行うハンドラークラス
@ControllerAdvice
public class EmployeeExceptionHandler {
    /** デバッグフラグ
     *  デバッグOFF:0
     *  デバッグON:0以外
     *  デバッグON時はスタックトレースを出力する
     */
    private static final int DEBUG = 0;

    /**
     * APIのURLが不正の場合のエラー処理を行う
     * @param ex MethodArgumentTypeMismatch例外
     * @return レスポンスエンティティオブジェクト
     */
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<EmployeeExceptionResponse> handleMethodArgumentTypeMismatchException(
            MethodArgumentTypeMismatchException ex) {
        EmployeeExceptionResponse exceptionResponse = new EmployeeExceptionResponse(
                ex.getMessage(), getStackTraceLog(ex.getStackTrace()), new Date());
        return new ResponseEntity<EmployeeExceptionResponse>(
                exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    /**
     * Employeeクラスのチェック処理でエラーになった場合の処理を行う.
     * @param ex MethodArgumentNotValid例外
     * @return レスポンスエンティティオブジェクト
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<EmployeeExceptionResponse> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException ex) {
        EmployeeExceptionResponse exceptionResponse = new EmployeeExceptionResponse(
                getMethodArgumentNoValidExceptionMsg(ex), ex.getMessage(), new Date());
        return new ResponseEntity<EmployeeExceptionResponse>(
                exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    /**
     * その他例外が発生した場合の処理を行う.
     * @param ex 任意例外
     * @return レスポンスエンティティオブジェクト
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<EmployeeExceptionResponse> handleException(Exception ex) {
        EmployeeExceptionResponse exceptionResponse = new EmployeeExceptionResponse(
                ex.getMessage(), getStackTraceLog(ex.getStackTrace()), new Date());
        return new ResponseEntity<EmployeeExceptionResponse>(
                exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * スタックトレースログの文字列を取得する.
     * @param stackArray StackTraceElement配列
     * @return スタックトレースログの文字列
     */
    private String getStackTraceLog(StackTraceElement[] stackArray) {
        if(DEBUG != 0){
            StringBuffer detail = new StringBuffer();
            for(StackTraceElement stackTraceElement : stackArray) {
                detail.append(stackTraceElement);
            }
            return detail.toString();
        }else{
            return "";
        }
    }

    /**
     * MethodArgumentNotValid例外からエラーメッセージを生成する
     * @param ex MethodArgumentNotValid例外
     * @return エラーメッセージ
     */
    private String getMethodArgumentNoValidExceptionMsg(
            MethodArgumentNotValidException ex) {
        StringBuffer errMsg = new StringBuffer();
        if(ex.getFieldErrorCount() > 0) {
            List<FieldError> fieldErrorList = ex.getFieldErrors();
            for(FieldError error : fieldErrorList) {
                errMsg.append(error.getDefaultMessage());
            }
        }
        if(ex.getGlobalErrorCount() > 0) {
            List<ObjectError> objectErrorList = ex.getGlobalErrors();
            for(ObjectError error : objectErrorList) {
                errMsg.append(error.getDefaultMessage());
            }
        }
        return errMsg.toString();
    }
}
