package com.example.demo.dto;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="goods=view", types=Goods.class)
public interface GoodsView {
	Integer getId();
	String getImage();
	String getName();
	String getPrice();
	String getCategory();
}
