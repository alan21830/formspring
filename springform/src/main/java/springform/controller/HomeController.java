package springform.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController
{
	
	@RequestMapping("/")
	public String homeWelcome(Model model)
	{
		
		ArrayList<String> as= new ArrayList<String>();
		as.add("Inserisci i tuoi Dati");
		
		model.addAttribute("as", as);
		return "home";
	}
	
	@RequestMapping("index")
	public String homeWelcomeTiles(Model model)
	{
		ArrayList<String> as= new ArrayList<String>();
		as.add("Inserisci i tuoi Dati");
		model.addAttribute("as", as);
		
		return "index";
	}	
	
	
	//per il tiles uso index e ritorna la stringa del bean definito nel tiles.xml
	
	
}
