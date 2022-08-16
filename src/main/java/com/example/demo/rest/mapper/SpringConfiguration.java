package com.example.demo.rest.mapper;

import com.example.demo.domain.Product;
import com.example.demo.rest.dtos.ProductDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        final ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        final TypeMap<ProductDto, Product> productDTOToEntityMap = modelMapper.createTypeMap(ProductDto.class, Product.class);
        productDTOToEntityMap.addMappings(expression -> expression.skip(Product::setId));
        return modelMapper;
    }
}
