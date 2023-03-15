package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {
    private LocalDate dataMentoria;

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    public double calcularXp() {
        return this.XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataMentoria=" + dataMentoria.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) +
                '}';
    }

}
