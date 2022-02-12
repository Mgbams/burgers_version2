package fr.orsys.kingsley.burgers.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.orsys.kingsley.burgers.business.Accompagnement;
import fr.orsys.kingsley.burgers.business.Boisson;
import fr.orsys.kingsley.burgers.business.Burger;
import fr.orsys.kingsley.burgers.service.AccompagnementService;
import fr.orsys.kingsley.burgers.service.BoissonService;
import fr.orsys.kingsley.burgers.service.BurgerService;
import fr.orsys.kingsley.burgers.serviceImpl.AccompagnementServiceImpl;
import fr.orsys.kingsley.burgers.serviceImpl.BoissonServiceImpl;
import fr.orsys.kingsley.burgers.serviceImpl.BurgerServiceImpl;

/**
 * Servlet implementation class Commande
 */
@WebServlet("/commande")
public class CommandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BurgerService burgerService = new BurgerServiceImpl();
	private BoissonService boissonService = new BoissonServiceImpl();
	private AccompagnementService accompagnementService = new AccompagnementServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommandeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("WEB-INF/merciCommande.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String votreBurgerId = request.getParameter("votre_burger");

		String votre_accompagnementId = request.getParameter("votre_accompagnement");
		String votre_boissonId = request.getParameter("votre_boisson");

		Burger burgerCommande = burgerService.recupererBurger(Long.parseLong(votreBurgerId));
		Boisson boissonCommande =  boissonService.recupererBoisson(Long.parseLong(votre_boissonId));
		Accompagnement accompagnementCommande = accompagnementService.recupererAccompagnement(Long.parseLong(votre_accompagnementId));
		
		Double coutTotatl =  burgerCommande.getPrix() + boissonCommande.getPrix() 
							+ accompagnementCommande.getPrix();
		
		request.setAttribute("burgerCommande", burgerCommande);
		request.setAttribute("accompagnementCommande", accompagnementCommande);
		request.setAttribute("boissonCommande",  boissonCommande);
		request.setAttribute("coutTotatl", coutTotatl );
	
		request.getRequestDispatcher("WEB-INF/merciCommande.jsp").forward(request, response);
	}

}
