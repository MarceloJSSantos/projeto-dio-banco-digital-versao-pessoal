package Enums;

import lombok.Getter;
import lombok.Setter;

public enum TipoConta {

    P("POUPANÇA"),
    C("CORRENTE");

    @Setter
    @Getter
    private String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }
}
