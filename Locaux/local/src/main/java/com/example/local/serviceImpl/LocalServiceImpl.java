package com.example.local.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.local.entities.Local;
import com.example.local.entities.dtos.LocalDTO;
import com.example.local.repositories.LocalRepository;
import com.example.local.service.LocalService;

@Service
public class LocalServiceImpl implements LocalService {
    @Autowired
    LocalRepository localRepository;
    @Autowired
     ModelMapper mapper;
    @Autowired
    private  SequenceGeneratorService sequenceGeneratorService;
    
	@Override
	public LocalDTO addLocal(String nomLocal, String numTel, String adresse) {
		Local local = new Local();
		
		local.setIdLocal(sequenceGeneratorService.generateSequence(Local.SEQUENCE_NAME));
			
		local.setNomLocal(nomLocal);
		local.setNumTel(numTel);
		local.setAdresse(adresse);
		
		Local newLocal=localRepository.save(local);
			return mapper.map(newLocal, LocalDTO.class);
	}
    
	@Override
	public List <LocalDTO> getList() {
		
		List<Local> locals = localRepository.findAll();
		return locals.stream().map(local -> mapper.map(local, LocalDTO.class))
				.collect(Collectors.toList());
	}


	@Override
	public LocalDTO updateLocal(long idLocal,LocalDTO RequestLocal) {
		Local local = new Local();
		Local localOld=localRepository.findByIdLocal(idLocal);
		local.setIdLocal(idLocal);
		local.setNomLocal(RequestLocal.getNomLocal());
		local.setNumTel(RequestLocal.getNumTel());
		local.setAdresse(RequestLocal.getAdresse());

        Local newLocal = localRepository.save(local);
	         return  mapper.map(newLocal, LocalDTO.class);
	}

	@Override
	public void deleteLocal(long idLocal) {
		Local local=localRepository.findByIdLocal(idLocal);
		localRepository.delete(local);
		
	}


	@Override
	public LocalDTO getLocalById(long idLocal) {
		// TODO Auto-generated method stub
		return null;
	}



}
