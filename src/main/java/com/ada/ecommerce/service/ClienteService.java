package com.ada.ecommerce.service;

import com.ada.ecommerce.model.Cliente;
import com.ada.ecommerce.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    // Método para salvar/cadastrar (com validação adaptada)
    public Cliente salvar(Cliente cliente) {
        // Aproveitando a ideia de validação (adaptada)
        if (cliente.getCpf() == null || cliente.getCpf().length() != 11) {
            throw new IllegalArgumentException("CPF inválido. Deve ter 11 dígitos.");
        }
        if (cliente.getEmail() == null || !cliente.getEmail().contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }
        return repository.save(cliente);
    }

    // Método para listar todos (Opção 2 do menu original)
    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    // Método para buscar por ID
    public Cliente buscarPorId(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado com ID: " + id));
    }

    // Implementação do PUT (Atualização Completa - Opção 3 do menu original)
    public Cliente atualizar(UUID id, Cliente clienteAtualizado) {
        Cliente clienteExistente = buscarPorId(id);

        clienteExistente.setNome(clienteAtualizado.getNome());
        clienteExistente.setDataNascimento(clienteAtualizado.getDataNascimento());
        clienteExistente.setEmail(clienteAtualizado.getEmail());
        clienteExistente.setCpf(clienteAtualizado.getCpf());

        return salvar(clienteExistente);
    }

    // Deleta um registro
    public void deletar(UUID id) {
        repository.deleteById(id);
    }
}