package com.eventos.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.eventos.app.models.Evento;
import com.eventos.app.repository.EventosRepository;

@Controller
public class EventosController {

    @Autowired
    private EventosRepository csr;

    // ================== HOME ==================
    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("eventos", csr.findAll());
        return mv;
    }

    // ================== CADASTRAR ==================
    @GetMapping("/cadastrarEvento")
    public String cadastrarEvento() {
        return "cadastrar-evento";
    }

    @PostMapping("/cadastrarEvento")
    public String salvarEvento(Evento evento, RedirectAttributes ra) {
        csr.save(evento);
        ra.addFlashAttribute("sucesso", "🎉 Evento cadastrado com sucesso!");
        return "redirect:/";
    }

    // ================== EDITAR ==================
    // Form de edição
    @GetMapping("/editarEvento/{idEvento}")
    public ModelAndView editarEvento(@PathVariable String idEvento) {
        Evento evento = csr.findByIdEvento(idEvento);
        ModelAndView mv = new ModelAndView("editar-evento");
        mv.addObject("evento", evento);
        return mv;
    }

    // Salvar alterações
    @PostMapping("/editarEvento/{idEvento}")
    public String atualizarEvento(@PathVariable String idEvento, Evento evento, RedirectAttributes ra) {
        // Garantir que o ID do evento não seja alterado
        evento.setIdEvento(idEvento);
        csr.save(evento);
        ra.addFlashAttribute("sucesso", "🎉 Evento alterado com sucesso!");
        return "redirect:/";
    }

    // ================== EXCLUIR ==================
    @GetMapping("/excluirEvento/{idEvento}")
    public String excluirEvento(@PathVariable String idEvento, RedirectAttributes ra) {
        csr.deleteById(idEvento);
        ra.addFlashAttribute("erro", "🗑 Evento excluído com sucesso!");
        return "redirect:/";
    }
}
