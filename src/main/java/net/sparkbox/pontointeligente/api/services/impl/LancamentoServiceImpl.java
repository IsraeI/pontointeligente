/**
 * 
 */
package net.sparkbox.pontointeligente.api.services.impl;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import net.sparkbox.pontointeligente.api.modelo.Lancamento;
import net.sparkbox.pontointeligente.api.services.LancamentoService;

/**
 * @author Israel
 *
 */
@Service
public class LancamentoServiceImpl implements LancamentoService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sparkbox.pontointeligente.api.services.LancamentoService#
	 * buscarPorFuncionarioId(java.lang.Long,
	 * org.springframework.data.domain.PageRequest)
	 */
	@Override
	public Page<Lancamento> buscarPorFuncionarioId(Long funcionarioId, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sparkbox.pontointeligente.api.services.LancamentoService#buscarPorId(java
	 * .lang.Long)
	 */
	@Override
	public Optional<Lancamento> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sparkbox.pontointeligente.api.services.LancamentoService#persistir(net.
	 * sparkbox.pontointeligente.api.modelo.Lancamento)
	 */
	@Override
	public Lancamento persistir(Lancamento lancamento) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.sparkbox.pontointeligente.api.services.LancamentoService#remover(java.
	 * lang.Long)
	 */
	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub

	}

}
