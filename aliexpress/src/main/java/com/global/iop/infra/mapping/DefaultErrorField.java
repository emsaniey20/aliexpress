package com.global.iop.infra.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author jiangyi.lx
 * @since 2022/9/6 8:15 下午
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface DefaultErrorField {
    /** JSON属性映射名称 **/
    public String value() default "";
}
