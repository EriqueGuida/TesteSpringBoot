package br.com.senai.teste.controller;

import br.com.senai.teste.service.EmprestimoService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EmprestimoController}.
 */
@Generated
public class EmprestimoController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'emprestimoController'.
   */
  private static BeanInstanceSupplier<EmprestimoController> getEmprestimoControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<EmprestimoController>forConstructor(EmprestimoService.class)
            .withGenerator((registeredBean, args) -> new EmprestimoController(args.get(0)));
  }

  /**
   * Get the bean definition for 'emprestimoController'.
   */
  public static BeanDefinition getEmprestimoControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EmprestimoController.class);
    beanDefinition.setInstanceSupplier(getEmprestimoControllerInstanceSupplier());
    return beanDefinition;
  }
}
