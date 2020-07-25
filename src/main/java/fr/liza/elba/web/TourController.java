package fr.liza.elba.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.liza.elba.dto.FamilleDto;
import fr.liza.elba.dto.SimFamilleDto;
import fr.liza.elba.dto.TourDto;
import fr.liza.elba.model.Tour;
import fr.liza.elba.service.TourService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/tour")
public class TourController {

	@Autowired
	private TourService tourService;

	@GetMapping("/getTourEnCours")
	@ResponseBody
	public TourDto getTourEnCours() {
		Tour tour = tourService.getTourEnCours();
		TourDto enCours = new TourDto(tour.getNb(), tour.getSemaine());
		if (tour != null && tour.getFamille() != null) {
			FamilleDto familleDto = new FamilleDto(
			tour.getFamille().getId(), tour.getFamille().getNom(), tour.getFamille().getGeneration(),
					tour.getFamille().getArgentIG());
			familleDto.setClasse(tour.getFamille().getClasse().getLibelle());
			if (tour.getFamille().getChef() != null) {
				SimFamilleDto chef = new SimFamilleDto(tour.getFamille().getChef().getPrenom(), tour.getFamille().getChef().getNom());
				if (tour.getFamille().getChef().getCouple() != null) {
					chef.setPrenomConjoint(tour.getFamille().getChef().getCouple().getPrenom());
					chef.setNomConjoint(tour.getFamille().getChef().getCouple().getNom());
					chef.setNomOrigineConjoint(tour.getFamille().getChef().getCouple().getFamilleOrigine().getNom());
				}
				familleDto.setChef(chef);


			}
			enCours.setFamille(familleDto);
		}
		return enCours;
	}

}
