package main.java.Beneficiario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dto_Beneficiario {
    private Long id;
    private String nome;
    private String address;
    private String telefone;
    private String senha;
}

