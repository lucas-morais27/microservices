package io.github.curso.mscartoes.application;

import io.github.curso.mscartoes.domain.ClienteCartao;
import io.github.curso.mscartoes.infra.repository.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteCartaoService {

    private final ClienteCartaoRepository clienteCartaoRepository;

    public ClienteCartaoService(ClienteCartaoRepository clienteCartaoRepository) {
        this.clienteCartaoRepository = clienteCartaoRepository;
    }

    public List<ClienteCartao> listCartoesByCpf(String cpf) {
        return clienteCartaoRepository.findByCpf(cpf);
    }
}
