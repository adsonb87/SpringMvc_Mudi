package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("C3Tech NBC-50 Base para Notebook");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51L-D6a7EaL._AC_SL1000_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Notebook-NBC-50BK-C3TECH-Docking-Stations/dp/B076FLFPHG/ref=sr_1_2?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2X89UPU05BYF2&keywords=c3tech&qid=1649121476&sprefix=c3+tech%2Caps%2C212&sr=8-2&ufe=app_do%3Aamzn1.fos.6d798eae-cadf-45de-946a-f477d47705b9");
		pedido.setDescricao("Descrição do pedido");

		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		
		return "home";
	}
	
}
