package com.autolight.service;

import java.util.List;

import com.autolight.entity.Lighttype;

public interface LighttypeService {

	public List<Lighttype> findLighttypeAll();

	public void saveLighttype(Lighttype lighttype);

	public Lighttype findLighttypeByID(Integer lighttype_id);

	public void deleteLighttype(Integer[] id);

}
