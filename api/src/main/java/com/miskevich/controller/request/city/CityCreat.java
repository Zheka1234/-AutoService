package com.miskevich.controller.request.city;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Schema(description = "Create city object without system info")
public class CityCreat {

    @NotBlank
    @Schema(example = "postal code", required = true, minLength = 3, maxLength = 20)
    @Size(min = 3, max = 20)
    private String postalCode;

    @NotBlank
    @Schema(example = "name city", required = true, minLength = 3, maxLength = 40)
    @Size(min = 3, max = 40)
    private String cityName;


}
