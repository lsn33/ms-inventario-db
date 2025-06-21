package com.example.ms_inventario_db.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ms_inventario_db.model.dto.ProductoDTO;
import com.example.ms_inventario_db.service.ProductoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/{id}")
    public ProductoDTO findProductoById(@PathVariable("id") Long id) {
        return productoService.findProductoById(id);
    }

    @PostMapping
    public ProductoDTO createProducto(@RequestBody ProductoDTO productoDTO) {
        return productoService.createProducto(productoDTO);
    }

    @GetMapping
    public List<ProductoDTO> findAllProductos() {
        return productoService.findAllProductos();
}


    


}
