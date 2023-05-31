package br.com.felipesilva.featuretoggle.controller;

import br.com.felipesilva.featuretoggle.dto.DisabledToggleResponse;
import br.com.felipesilva.featuretoggle.exception.FeatureToggleDisabledException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestControllerExceptionHandler {

    private static final String FEATURE_TOGGLE_DISABLED_MESSAGE = "toggle is disabled";

    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(FeatureToggleDisabledException.class)
    public DisabledToggleResponse featureToggleDisabledExceptionHandler(FeatureToggleDisabledException e) {
        return DisabledToggleResponse.builder()
                .toggleName(e.getFeatureToggleName())
                .message(FEATURE_TOGGLE_DISABLED_MESSAGE)
                .build();
    }
}