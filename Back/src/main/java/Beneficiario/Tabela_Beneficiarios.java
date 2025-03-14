package main.java.Beneficiario;

import jakarta.persistence.Column;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity //Entende que isso é uma tabela
@Table(name= "tb_Beneficiarios")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tabela_Beneficiarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column (name = "adress")
    private String adress;

    @Column (name = "telefone")
    private String telefone;

    @Column (name = "senha")
    private String senha;


}