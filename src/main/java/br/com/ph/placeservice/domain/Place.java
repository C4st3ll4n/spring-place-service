package br.com.ph.placeservice.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.UUID;

public record Place(
        UUID id, String name, String slug, String state,
        @CreatedDate LocalDateTime createdAt, @LastModifiedDate LocalDateTime updatedAt
) {
}
