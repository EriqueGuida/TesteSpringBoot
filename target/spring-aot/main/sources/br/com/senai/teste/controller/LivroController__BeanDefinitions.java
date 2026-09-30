package br.com.senai.teste.controller;

import br.com.senai.teste.service.LivroService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LivroController}.
 */
@Generated
public class LivroController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'livroController'.
   */
  private static BeanInstanceSupplier<LivroController> getLivroControllerInstanceSupplier() {
    return BeanInstanceSupplier.<LivroController>forConstructor(LivroService.class)
            .withGenerator((registeredBean, args) -> new LivroController(args.get(0)));
  }

  /**
   * Get the bean definition for 'livroController'.
   */
  public static BeanDefinition getLivroControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LivroController.class);
    beanDefinition.setInstanceSupplier(getLivroControllerInstanceSupplier());
    return beanDefinition;
  }
}
