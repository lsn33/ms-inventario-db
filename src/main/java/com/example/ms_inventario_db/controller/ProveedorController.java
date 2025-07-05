package com.example.ms_inventario_db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms_inventario_db.model.dto.ProveedorDTO;
import com.example.ms_inventario_db.service.ProveedorService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    private ProveedorService proveedorService;

    @Operation(
        summary = "Obtener proveedor por ID",
        description = "Busca un proveedor en el sistema por su ID"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Proveedor encontrado",
                     content = @Content(schema = @Schema(implementation = ProveedorDTO.class))),
        @ApiResponse(responseCode = "404", description = "Proveedor no encontrado")
    })
    @GetMapping("/{id}")
    public ProveedorDTO findProveedorById(
        @Parameter(description = "ID del proveedor", example = "1001")
        @PathVariable("id") Integer id) {
        return proveedorService.findProveedorById(id);
    }
}
