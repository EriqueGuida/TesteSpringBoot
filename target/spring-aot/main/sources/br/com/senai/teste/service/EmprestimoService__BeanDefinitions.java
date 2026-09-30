package br.com.senai.teste.service;

import br.com.senai.teste.repository.EmprestimoRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EmprestimoService}.
 */
@Generated
public class EmprestimoService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'emprestimoService'.
   */
  private static BeanInstanceSupplier<EmprestimoService> getEmprestimoServiceInstanceSupplier() {
    return BeanInstanceSupplier.<EmprestimoService>forConstructor(EmprestimoRepository.class, AlunoService.class, LivroService.class)
            .withGenerator((registeredBean, args) -> new EmprestimoService(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'emprestimoService'.
   */
  public static BeanDefinition getEmprestimoServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EmprestimoService.class);
    beanDefinition.setInstanceSupplier(getEmprestimoServiceInstanceSupplier());
    return beanDefinition;
  }
}
