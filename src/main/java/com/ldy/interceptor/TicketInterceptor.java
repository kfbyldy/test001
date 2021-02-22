package com.ldy.interceptor;

import com.ldy.web.sss;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: ticket拦截
 * @Data: 2020/12/16 10:47
 */
@Component
public class TicketInterceptor implements HandlerInterceptor {

	private static final Logger logger = LoggerFactory.getLogger(TicketInterceptor.class);
	public static final String HTTP_HEADER_TICKET = "ticket";

//	@Autowired
	private sss uacBizService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
