package br.com.ph.placeservice.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public record Place(
        UUID id, String name, String slug, String state, LocalDateTime createdAt, LocalDateTime updatedAt
) {
}
