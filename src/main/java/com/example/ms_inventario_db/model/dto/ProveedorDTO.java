package com.example.ms_inventario_db.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(description = "DTO que representa a un proveedor de perfumes")
public class ProveedorDTO {

    @Schema(description = "ID del proveedor", example = "2001")
    private int idProveedor;

    @Schema(description = "Nombre del proveedor", example = "Aromas del Mundo S.A.")
    private String nombre;

    @Schema(description = "Correo electrónico del proveedor", example = "contacto@aromasdelmundo.com")
    private String email;

    @Schema(description = "Número de teléfono del proveedor", example = "+34123456789")
    private String telefono;
}
