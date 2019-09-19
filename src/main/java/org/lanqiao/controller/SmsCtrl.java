package org.lanqiao.controller;

import com.alipay.api.AlipayApiException;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import org.lanqiao.Tool.CodeUtil;
import org.lanqiao.Tool.SmsTool;
import org.lanqiao.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
@Controller
@RequestMapping("/sms")
public class SmsCtrl {

    @Autowired
    OrderService orderService;
        /**
         * 发送短信
         * @param phone
         * @param request
         * @return
         * @throws ClientException
         */
        @RequestMapping(value = "/smsXxs")
        @ResponseBody
        public Map<String,Object> smsXxs(String phone, HttpServletRequest request) throws ClientException {
            Map<String,Object> map = new HashMap<>();
            // 验证码（指定长度的随机数）
            String code = CodeUtil.generateVerifyCode(6);
            String TemplateParam = "{\"code\":\""+code+"\"}";
            // 短信模板id
            String TemplateCode = "SMS_173945531";
            SendSmsResponse response = SmsTool.sendSms(phone,TemplateParam,TemplateCode);
            map.put("verifyCode",code);
            map.put("phone",phone);
            request.getSession().setAttribute("CodePhone",map);
            if( response.getCode().equals("OK")) {
                map.put("isOk","OK");
            }
            else{
                System.out.println(response.getCode());
            }
            return map;
        }

    @RequestMapping("/ali")
    public void ali(HttpServletResponse response, HttpServletRequest request) throws IOException, AlipayApiException {
        orderService.ali( response,request);
    }

}


