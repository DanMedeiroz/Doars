package main.Doador;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dto_Doador {
    private long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

}
