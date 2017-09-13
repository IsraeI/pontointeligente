/**
 * 
 */
package net.sparkbox.pontointeligente.api.services.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import net.sparkbox.pontointeligente.api.modelo.Funcionario;
import net.sparkbox.pontointeligente.api.services.FuncionarioService;

/**
 * @author Israel
 *
 */
@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sparkbox.pontointeligente.api.services.FuncionarioService#persistir(net.
	 * sparkbox.pontointeligente.api.modelo.Funcionario)
	 */
	@Override
	public Funcionario persistir(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
