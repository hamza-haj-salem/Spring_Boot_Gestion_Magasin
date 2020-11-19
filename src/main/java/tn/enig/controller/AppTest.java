package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tn.enig.dao.IMagasinDao;
import tn.enig.dao.IProduitDao;
import tn.enig.model.Magasin;

@Controller
public class AppTest {
	
	@Autowired
	private IMagasinDao daom;
	@Autowired
	private IProduitDao daop;
	
	public void setDaom(IMagasinDao daom) { this.daom = daom; }
	public void setDaop(IProduitDao daop) { this.daop = daop; }
	
	@GetMapping("/listemag")
	public String get1(Model m) {
		List<Magasin> liste1=daom.findAll();
						//liste hiya l bch n7ottouha fl jsp
		System.out.println(liste1);
		m.addAttribute("liste",liste1);
		return "listemag"; //listemag esm l page 
	}
}
