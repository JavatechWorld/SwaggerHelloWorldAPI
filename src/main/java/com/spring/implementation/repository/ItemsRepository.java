package com.spring.implementation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.implementation.model.Items;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer>{

}
