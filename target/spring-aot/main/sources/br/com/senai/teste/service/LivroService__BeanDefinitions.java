package br.com.senai.teste.service;

import br.com.senai.teste.repository.LivroRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link LivroService}.
 */
@Generated
public class LivroService__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'livroService'.
   */
  private static BeanInstanceSupplier<LivroService> getLivroServiceInstanceSupplier() {
    return BeanInstanceSupplier.<LivroService>forConstructor(LivroRepository.class)
            .withGenerator((registeredBean, args) -> new LivroService(args.get(0)));
  }

  /**
   * Get the bean definition for 'livroService'.
   */
  public static BeanDefinition getLivroServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(LivroService.class);
    beanDefinition.setInstanceSupplier(getLivroServiceInstanceSupplier());
    return beanDefinition;
  }
}
