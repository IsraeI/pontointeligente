/**
 * 
 */
package net.sparkbox.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import net.sparkbox.pontointeligente.api.modelo.Empresa;

/**
 * @author Israel
 *
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);
}
