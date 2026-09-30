package br.com.senai.teste;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TesteApplication}.
 */
@Generated
public class TesteApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'testeApplication'.
   */
  public static BeanDefinition getTesteApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TesteApplication.class);
    beanDefinition.setInstanceSupplier(TesteApplication::new);
    return beanDefinition;
  }
}
