package fr.orsys.kingsley.burgers.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import fr.orsys.kingsley.burgers.business.Accompagnement;
import fr.orsys.kingsley.burgers.service.AccompagnementService;

public class AccompagnementServiceImpl implements AccompagnementService {
	private static List< Accompagnement>  accompagnements = new ArrayList<>();
	private static final int ACCOMPAGNEMENT_LIST = 5;
	
	@Override
	public Accompagnement ajouterAccompagnement(String name, Double prix) {
		Accompagnement accompagnement = new Accompagnement(name, prix);

		if (accompagnements.size() < ACCOMPAGNEMENT_LIST) {
			accompagnements.add(accompagnement);
		}

		return accompagnement;
	}

	@Override
	public List<Accompagnement> recupererAccompagnements() {
		return accompagnements;
	}

	@Override
	public Accompagnement recupererAccompagnement(Long id) {
		for (Accompagnement accompagnement : accompagnements) {
			if (accompagnement.getId().equals(id)) {
				return accompagnement;
			}
		}
		return null;
	}

	@Override
	public boolean supprimerAccompagnement(Long id) {
		Accompagnement accompagnementASupprimer = recupererAccompagnement(id);
		if (accompagnementASupprimer == null) {
			return false;
		} else {
			return accompagnements.remove(accompagnementASupprimer);
		}
	}


}
