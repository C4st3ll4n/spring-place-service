package br.com.ph.placeservice.api;

import java.time.LocalDateTime;

public record PlaceRequest(
        String name, String slug, String state, LocalDateTime createdAt, LocalDateTime updatedAt
) {
}
