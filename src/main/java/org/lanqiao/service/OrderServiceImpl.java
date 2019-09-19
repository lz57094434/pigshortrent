package org.lanqiao.service;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.lanqiao.Tool.CodeUtil;
import org.lanqiao.Tool.changeclass;
import org.lanqiao.config.AlipayConfig;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public void ali(HttpServletResponse response, HttpServletRequest request) throws AlipayApiException, IOException {
        //设置编码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        //获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
        //设置请求参数
        AlipayTradePagePayRequest aliPayRequest = new AlipayTradePagePayRequest();
        aliPayRequest.setReturnUrl(AlipayConfig.return_url);
        aliPayRequest.setNotifyUrl(AlipayConfig.notify_url);

        String a=request.getParameter("jine");

        //商户订单号，后台可以写一个工具类生成一个订单号，必填
        String order_number = new String(CodeUtil.generateVerifyCode(10));
        //付款金额，从前台获取，必填
        //订单名称，必填
        String subject = new String("傻逼还钱");
        aliPayRequest.setBizContent("{\"out_trade_no\":\"" + order_number + "\","
                + "\"total_amount\":\"" + a + "\","
                + "\"subject\":\"" + subject + "\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
        //请求
        String result = alipayClient.pageExecute(aliPayRequest).getBody();
        //输出
        out.println(result);//以下写自己的订单代码
    }

}
