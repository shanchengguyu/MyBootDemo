package com.pactera.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author James
 * @date 2021/5/6
 * @decription
 */
public class MyFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("过滤器初始化开始！");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		HttpServletRequest request1 = (HttpServletRequest) request;
//		if("/favicon.ico".equals(request1.getRequestURI())){
//			System.out.println("/favicon.ico请求，直接返回！");
//			return;
//		}
//		Enumeration<String> parameterNames = request.getParameterNames();
//		System.out.println("获取请求入参：");
//		String targetParam=null;
//		while (parameterNames.hasMoreElements()){
//			String s = parameterNames.nextElement();
////			System.out.println(s);
////			if("num".equals(s)){
////				targetParam=s;
////				break;
////			}
////		}
////		String parameter = request.getParameter(targetParam);
////		System.out.println(parameter);
////		if(Integer.parseInt(parameter)<10){
////			chain.doFilter(request,response);
////		}else{
//			System.out.println("入参不符合要求！");
//
//			ServletOutputStream outputStream = response.getOutputStream();
//			OutputStreamWriter out = new OutputStreamWriter(outputStream, 
//					"GB2312");
//			try {
//				out.write("入参不符合要求");
//			} finally {
//				out.close();
//			}
//		}
		chain.doFilter(request,response);
	}

	@Override
	public void destroy() {
		System.out.println("过滤器执行结束！");
	}
}
