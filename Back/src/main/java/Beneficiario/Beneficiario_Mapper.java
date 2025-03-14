package main.java.Beneficiario;

import org.springframework.stereotype.Component;

@Component //PELO que entendi evita o processo manual que facilita bastante
public class Beneficiario_Mapper {
    // salva os dados de um usuário no banco de dados.
    public Tabela_Beneficiarios tabelaBeneficiarios(Dto_Beneficiario novoBeneficiario){
        Tabela_Beneficiarios tabelaBeneficiarios=new Tabela_Beneficiarios();
        tabelaBeneficiarios.setId(novoBeneficiario.getId());
        tabelaBeneficiarios.setAdress(novoBeneficiario.getAddress());
        tabelaBeneficiarios.setNome(novoBeneficiario.getNome());
        tabelaBeneficiarios.setSenha(novoBeneficiario.getSenha());
        tabelaBeneficiarios.setTelefone(novoBeneficiario.getTelefone());
        return tabelaBeneficiarios;
    }
    //Faz uma parte da tabela do banco voltar como obj
    public Dto_Beneficiario dtoBeneficiario(Tabela_Beneficiarios tabelaBeneficiarios){
        Dto_Beneficiario dtoBeneficiario=new Dto_Beneficiario();
        dtoBeneficiario.setId(tabelaBeneficiarios.getId());
        dtoBeneficiario.setAddress(tabelaBeneficiarios.getAdress());
        dtoBeneficiario.setNome(tabelaBeneficiarios.getNome());
        dtoBeneficiario.setSenha(tabelaBeneficiarios.getSenha());
        dtoBeneficiario.setTelefone(tabelaBeneficiarios.getTelefone());
        return dtoBeneficiario;
    }
}
