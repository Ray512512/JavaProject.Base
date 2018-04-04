package com.mp.fx.manager.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by songxs on 2017/7/13.
 */
public class UserSecurityInterceptor implements HandlerInterceptor {
//    @Autowired
//    RestService restService;
    /**
     * 用户名cookie
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        String requestURI = request.getRequestURI();
        return true;
//        if(session==null){
//            //没有登录成功，跳转到登录页面
//            throw new LoginException("need Login");
//        }else {
//            String userId = WebUtils.getCookie(request, UserConstant.USER_ID_COOKIE);
//            String companyId = WebUtils.getCookie(request, UserConstant.COMPANY_ID_COOKIE);
//            if(StringUtil.isEmpty(userId) || StringUtil.isEmpty(companyId)) {
//                //没有登录成功，跳转到登录页面
//                throw new LoginException("need Login");
//            }
//            if(!userId.equals(session.getAttribute(UserConstant.USER_ID_COOKIE).toString())
//                    || !companyId.equals(session.getAttribute(UserConstant.COMPANY_ID_COOKIE).toString())) {
//                //没有登录成功，跳转到登录页面
//                throw new LoginException("need Login");
//            }
//            IData excludeRestData = restService.getExcludeRestData();
//            if(excludeRestData.get(requestURI) != null){
//                return true;
//            }
//            IData restData = (IData) request.getSession().getAttribute("restData");
//            if(restData.get(requestURI) != null){
//                return true;
//            }
//
//            throw new PermissionException("无权限访问");
//        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
