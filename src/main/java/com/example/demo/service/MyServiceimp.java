package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Goods;
import com.example.demo.mapper.GoodsMapperDao;


@Service
public class MyServiceimp implements MyService {

	@Autowired
	private GoodsMapperDao dao;
	@Override
	public List<Goods> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	
	

}
