package br.com.felipesilva.featuretoggle.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DisabledToggleResponse {

    private String toggleName;
    private String message;
}
