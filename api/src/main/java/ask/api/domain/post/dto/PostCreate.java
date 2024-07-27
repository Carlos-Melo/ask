package ask.api.domain.post.dto;

import ask.api.domain.post.Status;
import ask.api.domain.user.Users;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record PostCreate(
    @NotBlank
    String title,
    @NotBlank
    String description,
    @Valid
    Status status,
    @Valid
    Users user) {
}
