package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosCompletos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.getDevsInscritos().add(this);
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }


    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosCompletos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Conteudo não encontrado");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosCompletos.stream().mapToDouble(Conteudo::CalcularXp).sum();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosCompletos() {
        return conteudosCompletos;
    }

    public void setConteudosCompletos(Set<Conteudo> conteudosCompletos) {
        this.conteudosCompletos = conteudosCompletos;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosCompletos, dev.conteudosCompletos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudosInscritos, conteudosCompletos);
    }
}
