package fr.orsys.kingsley.burgers.service;

import java.util.List;

import fr.orsys.kingsley.burgers.business.Accompagnement;

public interface AccompagnementService {
	
	Accompagnement ajouterAccompagnement(final String name, final Double prix);

	List<Accompagnement> recupererAccompagnements();

	Accompagnement recupererAccompagnement(Long id);

	boolean supprimerAccompagnement(Long id);
}
