package com.bd.musify.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlaylistRequest {

    @NotBlank(message = "Playlist name is required")
    @Size(max = 100, message = "Playlist name must not exceed 100 char")
    private String name;

    @Size(max = 500, message = "Description must not exceed 500 char")
    private String description;

    private Boolean isPublic;
}
