/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot;

import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.support.SpringFactoriesLoader;

/**
 * 用于支持自定义报告{@link SpringApplication}启动错误的回调接口。
 * 通过{@link SpringFactoriesLoader}加载，并且必须使用一个{@link ConfigurableApplicationContext}参数声明一个公共构造函数
 * @author Phillip Webb
 * @since 2.0.0
 * @see ApplicationContextAware
 */
@FunctionalInterface
public interface SpringBootExceptionReporter {

	/**
	 * 报告一个启动错误给调用者
	 * @param failure the source failure
	 * @return {@code true} if the failure was reported or {@code false} if default
	 * reporting should occur.
	 */
	boolean reportException(Throwable failure);

}
