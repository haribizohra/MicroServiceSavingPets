package com.example.local.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.local.entities.dtos.LocalDTO;
import com.example.local.service.LocalService;



@RequestMapping(value = "/local")
@RestController
public class LocalController {
	 @Autowired
		private LocalService iLocal;
	 @PostMapping("/create")
		@ResponseStatus(HttpStatus.CREATED)
		public ResponseEntity<LocalDTO> createLocal( @RequestBody LocalDTO f){
		    
		 LocalDTO responseLocal=iLocal.addLocal(f.getNomLocal() , f.getNumTel(), f.getAdresse());
			return new ResponseEntity<>(responseLocal, HttpStatus.OK);

		}
	 
		@PutMapping("/updateLocal/{idLocal}")
		@ResponseStatus(HttpStatus.OK)
		public ResponseEntity<LocalDTO> updateLocal(@PathVariable("idLocal") long idLocal, @RequestBody LocalDTO f) {
			
			LocalDTO responseLocal=iLocal.updateLocal(idLocal,f);
			return new ResponseEntity<>(responseLocal, HttpStatus.OK);

		}
		@DeleteMapping("/deleteLocal/{idLocal}")
		@ResponseStatus(HttpStatus.OK)
		public void deleteLocal(@PathVariable("idLocal") long idLocal){
			
		    iLocal.deleteLocal(idLocal);
			
		}
		
		@GetMapping("/locals")
		@ResponseStatus(HttpStatus.OK)
		public List<LocalDTO> getLocals(){
			return iLocal.getList();
		}	

}
