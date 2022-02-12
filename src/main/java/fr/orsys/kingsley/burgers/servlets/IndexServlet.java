package fr.orsys.kingsley.burgers.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.orsys.kingsley.burgers.business.Accompagnement;
import fr.orsys.kingsley.burgers.business.Boisson;
import fr.orsys.kingsley.burgers.business.Burger;
import fr.orsys.kingsley.burgers.business.Mois;
import fr.orsys.kingsley.burgers.business.Sauce;
import fr.orsys.kingsley.burgers.service.AccompagnementService;
import fr.orsys.kingsley.burgers.service.BoissonService;
import fr.orsys.kingsley.burgers.service.BurgerService;
import fr.orsys.kingsley.burgers.service.SauceService;
import fr.orsys.kingsley.burgers.serviceImpl.AccompagnementServiceImpl;
import fr.orsys.kingsley.burgers.serviceImpl.BoissonServiceImpl;
import fr.orsys.kingsley.burgers.serviceImpl.BurgerServiceImpl;
import fr.orsys.kingsley.burgers.serviceImpl.SauceServiceImpl;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BurgerService burgerService = new BurgerServiceImpl();
	private BoissonService boissonService = new BoissonServiceImpl();
	private AccompagnementService accompagnementService = new AccompagnementServiceImpl();
	private SauceService sauceService = new SauceServiceImpl();
	private List<String> mois = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		burgerService.ajouterBurger("BLT Burger", 15.00);
		burgerService.ajouterBurger("King Marcel", 12.50);
		burgerService.ajouterBurger("Joe Burger", 11.20);
		burgerService.ajouterBurger("Le Ruisseau Burger", 19.30);
		List<Burger> burgerLists = burgerService.recupererBurgers();

		boissonService.ajouterBoisson("Coca-Cola", 1.50);
		boissonService.ajouterBoisson("Orangina", 1.20);
		boissonService.ajouterBoisson("Schweppes", 1.00);
		boissonService.ajouterBoisson("Coca Cherry", 1.00);
		List<Boisson> boissonLists = boissonService.recupererBoissons();

		accompagnementService.ajouterAccompagnement("Frites", 2.00);
		accompagnementService.ajouterAccompagnement("Onion Rings", 3.25);
		accompagnementService.ajouterAccompagnement("Haricots Verts", 4.20);
		accompagnementService.ajouterAccompagnement("Salade verte", 6.80);
		accompagnementService.ajouterAccompagnement("Le coleslaw", 7.50);
		List<Accompagnement> accompagnementLists = accompagnementService.recupererAccompagnements();
		
		sauceService.ajouterSauce("Ketchup", 0.15);
		sauceService.ajouterSauce("Mayonnaise", 0.2);
		sauceService.ajouterSauce("Barbacue", 0.25);
		sauceService.ajouterSauce("Curry", 0.3);
		List<Sauce> sauceLists = sauceService.recupererSauces();

		LocalDate currentdate = LocalDate.now();
		int anneeActuelle = currentdate.getYear();
		List<Integer> annees = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			annees.add(anneeActuelle + i);
		}

		for (Mois moisSingle : Mois.values()) {
			if (mois.size() < 12) {
				mois.add(moisSingle.getMois());
			}
		}

		request.setAttribute("annees", annees);
		request.setAttribute("accompagnementLists", accompagnementLists);
		request.setAttribute("burgerLists", burgerLists);
		request.setAttribute("boissonLists", boissonLists);
		request.setAttribute("mois", mois);
		request.setAttribute("sauceLists", sauceLists);

		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
