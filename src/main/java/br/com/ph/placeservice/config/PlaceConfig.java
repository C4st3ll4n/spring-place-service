package br.com.ph.placeservice.config;

import br.com.ph.placeservice.domain.PlaceRepository;
import br.com.ph.placeservice.domain.PlaceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {

    @Bean
    PlaceService placeService(PlaceRepository repository){
        return new PlaceService(repository);
    }
}
