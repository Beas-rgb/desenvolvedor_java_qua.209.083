package com.eventos.app.controllers;

import com.eventos.app.models.Evento;
import com.eventos.app.repository.EventosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EventosController {

    @Autowired
    private EventosRepository eventosRepository;

    // ===== LISTAR EVENTOS =====
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("eventos", eventosRepository.findAll());
        return mv;
    }

    // ===== FORM CADASTRAR =====
    @GetMapping("/cadastrarEvento")
    public String cadastrarEvento() {
        return "cadastrar-evento";
    }

    // ===== SALVAR EVENTO =====
    @PostMapping("/cadastrarEvento")
    public String salvarEvento(
            Evento evento,
            @RequestParam("imagem") String imagem,
            RedirectAttributes ra) {

        evento.setImagem(imagem);
        eventosRepository.save(evento);

        ra.addFlashAttribute("sucesso", "🎉 Evento cadastrado com sucesso!");
        return "redirect:/";
    }

    // ===== FORM EDITAR (GET) =====
    @GetMapping("/editarEvento/{idEvento}")
    public ModelAndView editarEvento(@PathVariable String idEvento) {
        ModelAndView mv = new ModelAndView("editar-evento");
        Evento evento = eventosRepository.findById(idEvento).orElseThrow();
        mv.addObject("evento", evento);
        return mv;
    }

    // ===== ATUALIZAR EVENTO (POST) =====
    @PostMapping("/editarEvento/{idEvento}")
    public String atualizarEvento(
            @PathVariable String idEvento,
            Evento evento,
            @RequestParam("imagem") String imagem,
            RedirectAttributes ra) {

        evento.setIdEvento(idEvento);
        evento.setImagem(imagem);
        eventosRepository.save(evento);

        ra.addFlashAttribute("sucesso", "✅ Evento atualizado!");
        return "redirect:/";
    }

    // ===== EXCLUIR EVENTO =====
    @GetMapping("/excluirEvento/{idEvento}")
    public String excluirEvento(@PathVariable String idEvento) {
        eventosRepository.deleteById(idEvento);
        return "redirect:/";
    }
}
