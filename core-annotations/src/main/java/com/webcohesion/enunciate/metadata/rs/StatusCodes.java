package com.webcohesion.enunciate.metadata.rs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The status codes that are possible under specified conditions.
 *
 * @author Ryan Heaton
 */
@Retention ( RetentionPolicy.RUNTIME )
@Target ({ ElementType.TYPE, ElementType.METHOD })
public @interface StatusCodes {

  ResponseCode[] value() default {};
}
