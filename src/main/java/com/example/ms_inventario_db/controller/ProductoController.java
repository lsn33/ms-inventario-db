package com.example.ms_inventario_db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ms_inventario_db.model.dto.ProductoDTO;
import com.example.ms_inventario_db.service.ProductoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Operation(
        summary = "Buscar producto por ID",
        description = "Retorna un producto específico del inventario usando su ID"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Producto encontrado", 
                     content = @Content(schema = @Schema(implementation = ProductoDTO.class))),
        @ApiResponse(responseCode = "404", description = "Producto no encontrado")
    })
    @GetMapping("/{id}")
    public ProductoDTO findProductoById(
        @Parameter(description = "ID del producto") @PathVariable("id") Long id) {
        return productoService.findProductoById(id);
    }

    @Operation(
        summary = "Crear un nuevo producto",
        description = "Crea un nuevo producto en el inventario con la información enviada"
    )
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Producto creado exitosamente", 
                     content = @Content(schema = @Schema(implementation = ProductoDTO.class))),
        @ApiResponse(responseCode = "400", description = "Datos inválidos")
    })
    @PostMapping
    public ProductoDTO createProducto(
        @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "Datos del producto a crear",
            required = true,
            content = @Content(schema = @Schema(implementation = ProductoDTO.class))
        )
        @RequestBody ProductoDTO productoDTO) {
        return productoService.createProducto(productoDTO);
    }

    @Operation(
        summary = "Obtener todos los productos",
        description = "Devuelve una lista con todos los productos del inventario"
    )
    @ApiResponse(responseCode = "200", description = "Lista de productos", 
                 content = @Content(schema = @Schema(implementation = ProductoDTO.class)))
    @GetMapping
    public List<ProductoDTO> findAllProductos() {
        return productoService.findAllProductos();
    }
}

