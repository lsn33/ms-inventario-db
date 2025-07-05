package com.example.ms_inventario_db.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO que representa un perfume en el inventario")
public class ProductoDTO {

    @Schema(description = "ID del producto", example = "1")
    private Long idProducto;

    @Schema(description = "Nombre del perfume", example = "Dior Sauvage Eau de Parfum")
    private String nombre;

    @Schema(description = "Descripción del perfume", example = "Fragancia amaderada y fresca para hombres, con notas de bergamota, ambroxan y pimienta.")
    private String descripcion;

    @Schema(description = "Precio del perfume", example = "129.99")
    private Float precio;

    @Schema(description = "Cantidad disponible en stock", example = "25")
    private int stock;

    @Schema(description = "ID del proveedor", example = "2001")
    private Integer proveedorId;

    @Schema(description = "Información detallada del proveedor")
    private ProveedorDTO proveedor;
}
