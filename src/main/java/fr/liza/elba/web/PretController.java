package fr.liza.elba.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.liza.elba.dto.PretDto;
import fr.liza.elba.model.Famille;
import fr.liza.elba.model.Pret;
import fr.liza.elba.service.FamilleService;
import fr.liza.elba.service.PretService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/pret")
public class PretController {

	@Autowired
	private PretService pretService;
	
	@Autowired
	private FamilleService familleService;

	@GetMapping("/getByFamille/{famille}")
	@ResponseBody
	public List<PretDto> getByFamille(@PathVariable(value="famille") long id) {
		Optional<Famille> famille =  familleService.getById(id);
		List<PretDto> resultats = new ArrayList<>();
		if (famille.isPresent()) {
			List<Pret> lPrets = pretService.getByFamille(famille.get());
			if(lPrets.size()>0) {
				for (Pret pret:lPrets) {
					PretDto pretDto = new PretDto(pret.getId());
					resultats.add(pretDto);
				}
			}
		}
		return resultats;
	}


}
