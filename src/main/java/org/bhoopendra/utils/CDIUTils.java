package org.bhoopendra.utils;

import java.util.Set;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.inject.spi.InjectionTarget;

import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.ContainerLifecycle;

public class CDIUTils {
	static ContainerLifecycle containerLifeCycle = null;

	public static void startContainer() {
		final WebBeansContext webBeansContext = WebBeansContext.getInstance();
		containerLifeCycle = webBeansContext.getService(ContainerLifecycle.class);
		containerLifeCycle.startApplication(null);
	}

	@SuppressWarnings("unchecked")
	public static <T> void injectFields(final T targetObject) {
		final BeanManager beanManager = CDI.current().getBeanManager();
		final AnnotatedType<T> annotatedType = (AnnotatedType<T>) beanManager
				.createAnnotatedType(targetObject.getClass());
		final InjectionTarget<T> injectionTarget = beanManager.createInjectionTarget(annotatedType);
		final Set<Bean<?>> beans = beanManager.getBeans(targetObject.getClass());
		final Bean<?> bean = beans.iterator().next();
		injectionTarget.inject(targetObject, (CreationalContext<T>) beanManager.createCreationalContext(bean));
	}

	public static void stopContainer() {
		containerLifeCycle.stopApplication(null);
	}

}
