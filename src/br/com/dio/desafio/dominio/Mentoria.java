package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate date;


    @Override
    public double CalcularXp() {
        return XP_PADRAO + 10;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitle() +
                "description=" + getDescription() +
                "date=" + date +
                '}';
    }
}
