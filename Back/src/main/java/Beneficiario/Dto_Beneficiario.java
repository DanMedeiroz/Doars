package main.java.Beneficiario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dto_Beneficiario {
    private long id;
    private String nome;
    private String cnpj;
    private String adress;
    private int telefone;

