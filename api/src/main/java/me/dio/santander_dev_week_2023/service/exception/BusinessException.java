package me.dio.santander_dev_week_2023.service.exception;

public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
