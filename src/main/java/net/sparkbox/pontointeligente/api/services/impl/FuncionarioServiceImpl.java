/**
 * 
 */
package net.sparkbox.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sparkbox.pontointeligente.api.modelo.Funcionario;
import net.sparkbox.pontointeligente.api.repositories.FuncionarioRepository;
import net.sparkbox.pontointeligente.api.services.FuncionarioService;

/**
 * @author Israel
 *
 */
@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sparkbox.pontointeligente.api.services.FuncionarioService#persistir(net.
	 * sparkbox.pontointeligente.api.modelo.Funcionario)
	 */
	@Override
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo funcionário: {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sparkbox.pontointeligente.api.services.FuncionarioService#buscarPorCpf(
	 * java.lang.String)
	 */
	@Override
	public Optional<Funcionario> buscarPorCpf(String cpf) {
		log.info("Buscando funcionário pelo CPF {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sparkbox.pontointeligente.api.services.FuncionarioService#buscarPorEmail(
	 * java.lang.String)
	 */
	@Override
	public Optional<Funcionario> buscarPorEmail(String email) {
		log.info("Buscando funcionário pelo email {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sparkbox.pontointeligente.api.services.FuncionarioService#buscarPorId(
	 * java.lang.Long)
	 */
	@Override
	public Optional<Funcionario> buscarPorId(Long id) {
		log.info("Buscando funcionário pelo IDl {}", id);
		return Optional.ofNullable(this.funcionarioRepository.findOne(id));
	}

}
