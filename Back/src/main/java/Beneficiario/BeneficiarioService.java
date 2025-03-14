package main.java.Beneficiario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BeneficiarioService {
    @Autowired
    private BeneficiarioRepository beneficiarioRepository;

    public Tabela_Beneficiarios salvarbeneficiario(Tabela_Beneficiarios tabelaBeneficiarios){
            return beneficiarioRepository.save(tabelaBeneficiarios);
    }
}
