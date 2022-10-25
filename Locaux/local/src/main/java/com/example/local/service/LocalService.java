package com.example.local.service;

import java.util.List;
import com.example.local.entities.dtos.LocalDTO;



public interface LocalService {
	
	public List<LocalDTO>getList();
	public LocalDTO addLocal(String nomLocal, String numTel, String adresse);
	public LocalDTO getLocalById(long idLocal); 
	public LocalDTO updateLocal(long idLocal ,LocalDTO RequestLocal); 
	public void deleteLocal(long idLocal); 
	


}
