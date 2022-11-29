package com.capstone.domain.menu.exception;

import com.capstone.global.error.exception.BusinessException;
import com.capstone.global.error.exception.ExceptionCodeAndDetails;

public class NotFoundMenuException extends BusinessException {

    public NotFoundMenuException() { super(ExceptionCodeAndDetails.NOT_FOUND_MENU); }
}
