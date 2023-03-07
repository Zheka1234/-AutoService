package com.miskevich.controller.request.city;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CityChange {

    @Schema(example = "city id", required = true, minLength = 3, maxLength = 20)
    private int id;

}
