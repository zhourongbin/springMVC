package interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class IndexInterceptor2 extends HandlerInterceptorAdapter {
	  /** 
     * ��ҵ��������������֮ǰ������ 
     * �������false 
     *     �ӵ�ǰ������������ִ��������������afterCompletion(),���˳���������
     * �������true 
     *    ִ����һ��������,ֱ�����е���������ִ����� 
     *    ��ִ�б����ص�Controller 
     *    Ȼ�������������, 
     *    �����һ������������ִ�����е�postHandle() 
     *    �����ٴ����һ������������ִ�����е�afterCompletion() 
     */   
    public boolean preHandle(HttpServletRequest request,   
            HttpServletResponse response, Object handler) throws Exception {
         
        System.out.println("2.preHandle(), �ڷ���Controller֮ǰ������"); 
        return true; 
         
    } 
 
    /**
     * ��ҵ��������������ִ����ɺ�,������ͼ֮ǰִ�еĶ���   
     * ����modelAndView�м������ݣ����統ǰʱ��
     */ 
     
    public void postHandle(HttpServletRequest request,   
            HttpServletResponse response, Object handler,   
            ModelAndView modelAndView) throws Exception { 
        System.out.println("2.postHandle(), �ڷ���Controller֮�󣬷�����ͼ֮ǰ������,�������ע��һ��ʱ�䵽modelAndView�У����ں�����ͼ��ʾ");
        modelAndView.addObject("date","��������2���ɵ�ʱ��:" + new Date());
    } 
 
    /** 
     * ��DispatcherServlet��ȫ����������󱻵���,������������Դ��  
     *  
     * �����������׳��쳣ʱ,��ӵ�ǰ����������ִ�����е���������afterCompletion() 
     */
     
    public void afterCompletion(HttpServletRequest request,   
            HttpServletResponse response, Object handler, Exception ex) 
    throws Exception { 
           
        System.out.println("2.afterCompletion(), �ڷ�����ͼ֮�󱻵���"); 
    } 
}
