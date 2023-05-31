package br.com.felipesilva.featuretoggle.annotation;

import br.com.felipesilva.featuretoggle.domain.FeatureToggle;
import br.com.felipesilva.featuretoggle.exception.FeatureToggleDisabledException;
import br.com.felipesilva.featuretoggle.repository.FeatureToggleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@RequiredArgsConstructor
@Component
public class ToggleAspect {

    private final FeatureToggleRepository featureToggleRepository;

    @Before("@annotation(toggle)")
    public void featureToggle(Toggle toggle) {
        if (!getFeatureToggle(toggle.name()).isEnabled()) {
            log.warn("feature-toggle={} is disabled", toggle.name());
            throw new FeatureToggleDisabledException(toggle.name());
        }
    }

    private FeatureToggle getFeatureToggle(String name) {
        return featureToggleRepository.findByName(name)
                .orElseThrow(() -> new FeatureToggleDisabledException(name));
    }
}
