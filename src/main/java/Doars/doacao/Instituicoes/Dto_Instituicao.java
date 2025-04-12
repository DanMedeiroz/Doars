package Doars.doacao.Instituicoes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Entity
@Table(name ="tb_Instituicao")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Dto_Instituicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long Id;
    String Nome;
    String Cnpj;
    String Cpf; //Acho que vai ser apenas para pessoas juridicas mas vou adicionar para algum caso futuro
    String Cidade;
    String Bairro;
    String Complemento;
    String Telefone;
    String Email;
    String Area_De_Atuacao; //se vai ser educao ou saude
}
