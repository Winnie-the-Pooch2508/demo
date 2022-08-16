package com.example.demo.rest;

import com.example.demo.domain.Product;
import com.example.demo.rest.dtos.ProductDto;
import com.example.demo.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
class ProductController {
    private final ProductService productService;
    private final ModelMapper modelMapper;

    ProductController (ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public ResponseEntity<List<ProductDto>> getAllProducts() {

        final List<ProductDto> products = productService.listAllProducts().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(products);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public ResponseEntity<ProductDto> getProduct(@PathVariable Long id, Model model) {
        final Product product = productService.getProductById(id);
        ProductDto productDto = convertToDto(product);
        return ResponseEntity.ok(productDto);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<ProductDto> createNewProduct(@RequestBody ProductDto newProductDto) {
        Product product = convertToEntity(newProductDto);
        final Product newProduct = productService.createNewProduct(product);
        ProductDto productDto = convertToDto(newProduct);
        return new ResponseEntity<>(productDto, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ProductDto> updateProduct(@RequestBody ProductDto updatedProductDto, @PathVariable Long id) {
        Product product = convertToEntity(updatedProductDto);
        final Product updatedProduct = productService.updateProduct(product, id);
        ProductDto productDto = convertToDto(updatedProduct);
        return ResponseEntity.ok(productDto);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    private ProductDto convertToDto(Product productEntity){
        return modelMapper.map(productEntity, ProductDto.class);
    }

    private Product convertToEntity(ProductDto productDto){
        return modelMapper.map(productDto,Product.class);
    }

}
