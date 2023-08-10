package br.com.ph.placeservice.domain;

import br.com.ph.placeservice.api.PlaceRequest;
import com.github.slugify.Slugify;
import reactor.core.publisher.Mono;

public class PlaceService {
    private PlaceRepository repository;
    private Slugify slugify;

    public PlaceService(PlaceRepository repository) {
        this.repository = repository;
        this.slugify = Slugify.builder().build();
    }

    public Mono<Place> create(PlaceRequest placeRequest) {
        var place = new Place(
                null, placeRequest.name(),
                slugify.slugify(placeRequest.name()), placeRequest.state(),
                null, null
        );
        return repository.save(place);
    }
}
