package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;

    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosFinalizados;

    public Dev(String nome) {
        this.nome = nome;
        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteudosFinalizados = new LinkedHashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosFinalizados() {
        return conteudosFinalizados;
    }

    public void setConteudosFinalizados(Set<Conteudo> conteudosFinalizados) {
        this.conteudosFinalizados = conteudosFinalizados;
    }

    public void inscreverNoBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudo());
        bootcamp.getDevsIncritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> concluido = this.conteudosInscritos.stream().findFirst();
        if (concluido.isPresent()) {
            this.conteudosInscritos.remove(concluido.get());
            this.conteudosFinalizados.add(concluido.get());
        }
    }

    public void totalXp() {
        this.conteudosFinalizados.stream()
                .mapToDouble(conteudo -> conteudo.calcularXp())
                .sum();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((conteudosFinalizados == null) ? 0 : conteudosFinalizados.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (conteudosFinalizados == null) {
            if (other.conteudosFinalizados != null)
                return false;
        } else if (!conteudosFinalizados.equals(other.conteudosFinalizados))
            return false;
        return true;
    }

}
