package com.capstone.domain.user.exception;

import com.capstone.global.error.exception.BusinessException;
import com.capstone.global.error.exception.ExceptionCodeAndDetails;

public class NotFoundUserException extends BusinessException {

    public NotFoundUserException() { super(ExceptionCodeAndDetails.NOT_FOUND_USER); }
}
