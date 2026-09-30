package br.com.senai.teste.exception;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ValidacaoExceptionHandler}.
 */
@Generated
public class ValidacaoExceptionHandler__BeanDefinitions {
  /**
   * Get the bean definition for 'validacaoExceptionHandler'.
   */
  public static BeanDefinition getValidacaoExceptionHandlerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValidacaoExceptionHandler.class);
    beanDefinition.setInstanceSupplier(ValidacaoExceptionHandler::new);
    return beanDefinition;
  }
}
