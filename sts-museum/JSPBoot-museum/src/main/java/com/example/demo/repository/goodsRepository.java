package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


import com.example.demo.dto.Goods;
import com.example.demo.dto.GoodsView;

@RepositoryRestResource(collectionResourceRel = "goods", path="goods",excerptProjection = GoodsView.class)
@CrossOrigin
public interface goodsRepository extends JpaRepository<Goods, Integer> {

}
