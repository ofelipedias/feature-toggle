package br.com.felipesilva.featuretoggle.repository;

import br.com.felipesilva.featuretoggle.domain.FeatureToggle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FeatureToggleRepository extends JpaRepository<FeatureToggle, Long> {

    Optional<FeatureToggle> findByName(String name);
}
