package com.codecademy.boots.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codecademy.boots.entities.Boot;
import com.codecademy.boots.enums.BootType;
import java.util.Optional;


public interface BootRepository extends CrudRepository<Boot, Integer> {
    
    // A la carte
    Optional<Boot> findById(Integer id);
    List<Boot> findBySize(Float size);
    List<Boot> findByMaterial(String material);
    List<Boot> findByType(BootType type);
    List<Boot> findBootByQuantityGreaterThan(Integer quantity);

    // By Material
    List<Boot> findBootByMaterialAndSizeAndType(String material, Float size, BootType type);
    List<Boot> findBootByMaterialAndQuantityGreaterThan(String material, Integer quantity);
    List<Boot> findBootByMaterialAndSizeAndTypeAndQuantityGreaterThan(String material, Float size, BootType type,Integer quantity);
    List<Boot> findBootByMaterialAndType(String material, BootType type);
    List<Boot> findBootByMaterialAndTypeAndQuantityGreaterThan(String material, BootType type, Integer quantity);

    // By Type
    List<Boot> findBootByTypeAndSize(BootType type, Float size);
    List<Boot> findBootByTypeAndQuantityGreaterThan(BootType type, Integer quantity);
    List<Boot> findBootByTypeAndSizeAndQuantityGreaterThan(BootType type, Float size, Integer quantity);

    // By Size
    List<Boot> findBootBySizeAndQuantityGreaterThan(Float size, Integer quantity);

}
