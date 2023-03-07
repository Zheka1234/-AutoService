package com.miskevich.controller.request.contact;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ContactChange {

    @Schema(example = "contact id", required = true, minLength = 3, maxLength = 20)
    private int id;
}
