package com.example.minimumcqrssample.infrastructure.spring.logger;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;

@Aspect
@Component
@Slf4j
public class AccessLogger {

  private static final String LOG_FORMAT = "[ Access Log ] uri={0}, method={1}";

  @Before("execution(* com.example.minimumcqrssample.interfaces.api.*..*Controller.*(..))")
  public void before() {
    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
    HttpServletRequest request = attributes.getRequest();

    String message = MessageFormat.format(LOG_FORMAT,
            request.getRequestURI(),
            request.getMethod());

    log.info(message);
  }

}
