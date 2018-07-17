package com.packt.sb5be.searchapp.dataservice.configuration;


import com.packt.sb5be.searchapp.dataservice.repository.ExtendedRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "org.baeldung.persistence.dao", repositoryBaseClass = ExtendedRepositoryImpl.class)
public class ExtendedJPAConfig {
}
