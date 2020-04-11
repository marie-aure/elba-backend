package fr.liza.elba.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.liza.elba.dto.FamilleDto;
import fr.liza.elba.dto.SimFamilleDto;
import fr.liza.elba.model.Famille;
import fr.liza.elba.model.Sim;
import fr.liza.elba.service.FamilleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/famille")
public class FamilleController {

	@Autowired
	private FamilleService familleService;

	@GetMapping("/getAll")
	@ResponseBody
	public List<FamilleDto> getAllFamille() {
		List<Famille> lFamilles = familleService.getAll();
		List<FamilleDto> resultats = new ArrayList<>();
		if (lFamilles.size() > 0) {
			for (Famille famille : lFamilles) {
				FamilleDto familleDto = new FamilleDto(famille.getId(), famille.getNom(), famille.getGeneration(),
						famille.getArgentIG());
				if (famille.getChef() != null) {
					SimFamilleDto chef = new SimFamilleDto(famille.getChef().getPrenom(), famille.getChef().getNom());
					familleDto.setChef(chef);
				}
				List<SimFamilleDto> lSFDtos = new ArrayList<>();
				if (famille.getlMembres().size() > 0) {
					for (Sim sim : famille.getlMembres()) {
						SimFamilleDto sFDto = new SimFamilleDto(sim.getPrenom(), sim.getNom());
						lSFDtos.add(sFDto);
					}
					familleDto.setlMembers(lSFDtos);
				}
				lSFDtos = new ArrayList<>();
				if (famille.getlMembresOrigine().size() > 0) {
					for (Sim sim : famille.getlMembresOrigine()) {
						SimFamilleDto sFDto = new SimFamilleDto(sim.getPrenom(), sim.getNom());
						lSFDtos.add(sFDto);
					}
					familleDto.setlMembersOrigine(lSFDtos);
				}
				resultats.add(familleDto);
			}

		}
		return resultats;
	}

}
