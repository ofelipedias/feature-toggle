package br.com.felipesilva.featuretoggle.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FeatureToggleDisabledException extends RuntimeException {
    private String featureToggleName;
}
