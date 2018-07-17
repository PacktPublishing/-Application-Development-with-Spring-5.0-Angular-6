package com.packt.sb5be.searchapp.dataservice.configuration;
import com.packt.sb5be.searchapp.dataservice.repository.ExtendedRepositoryImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.packt.sb5be.searchapp.dataservice.repository", repositoryBaseClass = ExtendedRepositoryImpl.class)
public class ExtendedRepositoryConfiguration {
    // additional JPA Configuration here
}
