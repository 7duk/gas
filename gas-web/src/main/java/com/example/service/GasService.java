package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.TOrderManageMapper;
import com.example.model.TOrderManage;

@Service
public class GasService {
	@Autowired
	private TOrderManageMapper manageMapper;

	public List<TOrderManage> selectAll() {
		return manageMapper.selectAll();
	}
}
