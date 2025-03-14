package main.java.Beneficiario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Doars")
public class Beneficiario_Controller {

    @Autowired
    private BeneficiarioService beneficiarioService;

    @Autowired
    private Beneficiario_Mapper beneficiarioMapper;  // Adicionando o Mapper

    @PostMapping("/adicionar")
    public ResponseEntity<Dto_Beneficiario> adicionar(@RequestBody Dto_Beneficiario dtoBeneficiario) {
        // Converte o DTO para a entidade (Tabela_Beneficiarios)
        Tabela_Beneficiarios tabelaBeneficiarios = beneficiarioMapper.tabelaBeneficiarios(dtoBeneficiario);

        // Salva a entidade no banco de dados
        Tabela_Beneficiarios salvo = beneficiarioService.salvarbeneficiario(tabelaBeneficiarios);

        // Converte a entidade salva de volta para o DTO
        Dto_Beneficiario novoDto = beneficiarioMapper.dtoBeneficiario(salvo);

        // Retorna a resposta com o DTO
        return ResponseEntity.status(HttpStatus.CREATED).body(novoDto);
    }
}
