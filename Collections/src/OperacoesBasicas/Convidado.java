package OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codConvite;
    public Convidado convidadoParaRemover;

    public Convidado(String nome, int codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodConvite() {
        return this.codConvite;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codConvidado='" + getCodConvite() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodConvite() == convidado.getCodConvite();
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(getCodConvite());
    }

}
