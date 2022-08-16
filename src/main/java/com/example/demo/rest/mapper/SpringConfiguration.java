package com.example.demo.rest.mapper;

import com.example.demo.domain.ProductEntity;
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
        final TypeMap<ProductDto, ProductEntity> productDTOToEntityMap = modelMapper.createTypeMap(ProductDto.class, ProductEntity.class);
        productDTOToEntityMap.addMappings(expression -> expression.skip(ProductEntity::setId));
        return modelMapper;
    }
}
