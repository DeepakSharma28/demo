//package com.cs.smoothy.interceptor;
//
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@Component
//public class ProductServiceInterceptor implements HandlerInterceptor {
//   @Override
//   public boolean preHandle(
//      HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//      
//      return true;
//   }
//   @Override
//   public void postHandle(
//      HttpServletRequest request, HttpServletResponse response, Object handler, 
//      ModelAndView modelAndView) throws Exception {}
//   
//   @Override
//   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
//      Object handler, Exception exception) throws Exception {}
//}