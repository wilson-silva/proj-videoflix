package br.com.alura.videoflix.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String color;
}