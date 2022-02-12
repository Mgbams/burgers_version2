package fr.orsys.kingsley.burgers.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import fr.orsys.kingsley.burgers.business.Burger;
import fr.orsys.kingsley.burgers.business.Sauce;
import fr.orsys.kingsley.burgers.service.SauceService;

public class SauceServiceImpl implements SauceService {
	private List<Sauce> sauces = new ArrayList<>();
	private static final int SAUCE_LIST = 4;
	
	@Override
	public Sauce ajouterSauce(String nom, Double prix) {
		Sauce sauce = new Sauce(nom, prix);
		
		if (sauces.size() < SAUCE_LIST ) {
			sauces.add(sauce);
		}
	
	return sauce;
	}

	@Override
	public List<Sauce> recupererSauces() {
		return sauces;
	}

	@Override
	public Sauce recupererSauce(Long id) {
		for (Sauce sauce : sauces) {
			if (sauce.getId().equals(id)) {
				return sauce;
			}
		}
		return null;
	}

	@Override
	public boolean supprimerSauce(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
