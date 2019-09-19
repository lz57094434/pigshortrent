package org.lanqiao.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101200667265";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCe1Iu7cnVzLblIPxO9lBoUwljdYDgGhOVTLmrBH2fbJlpAlRX+p1lY5Q0gL05j8118HiRmc702Q/W06GqoNSwtngY8u3zHUEBGkbK5hC62NR5HTetNckbFWr/yo3Pa/nDr2jCU8u0g5YWFU4U7r9kjF9uWzKNSN5NWyeGcsb4GPJOROvL7LrtVpOR49chOxKUm4nfSEJY5rWAWfyI0R9+FcV3Xrf1hNQ0V61uQoYe3/nXpaBPLzXqfpjZYCm0g+RQRqOIWBeMVUrrzs6yaT5t2echEYZAuqFFohS34PDgjHBumYPC36bnUokG5gxvmmKsSJ8yI6lgfEC+Mvbtpfz7xAgMBAAECggEAAZyUgmVp7a5EGAiT0bOkBBvovO5SAzbsAMkSyjzgV+fuuIMKwxe9n1pLpMz2FauNgknoAqYgAGH2J0zIcEaB2UCmPY2FeZxF2rF1x84gjzbAxOZ0gcesEiqWkga4kTtNuAbxwUEpyNCrZyvuySlCocmHL+OJsLbhptrLkER5ciS9HZF3JJyPEgakWdmYMBeNwcJFuCT43cJHFkJEal6gBW6YWwHgNin+DVcdRULS6Er/dU3PiBrcXlwbmocVESXDRD8q7k4StgHcAz3liX0gzsFd12IdITMMr5fT8Geka3N1HUeGhMUYmLGj5zV7f7adX6WHujiuWv4bDT2jzKeUQQKBgQDUZxl/erY3d1T5zdbKeL0EEqBFJXi0BtvdJ7OL0vybykGx1i1OlNPC2Ek/wqR3dei386vb0k45S61ZHXftMe+vtiQre7LLgUq8LvH1lNEXRIti+0T7nU4CNrwslPVdOk5YkYD+dLhj7QnbrgjCBajDAl9Q2DqQ6ZraQ2OcEHrVWQKBgQC/bm4re/dKSKwpnOYApsdmDz4qC2mvGiAaZsRmA7uF7DlgtM5cZqvjtnKF6OZJMAc1kSgSR+DadUfLqS1pIerSEXA97XmVC4jzLkV1C2XDwjmeWzjevrWW71+0sNC9OzukxVODR5NcJRkhlGBJP/qm5wOflloYLTJVJzWJGVpLWQKBgCLJ2CVHBf1DsElR63IyIFNAcbuhjYl+7hfk3sVyAynJEMV93OHYAm8RWb31tVZTm5A1etqAMYu012mXKANTgHx5CqeMlRY70O/NiJe+jhiPg3zsxrmnZBV8vYlXxHBGknpzKnuCxoinVEwEzy5oGuIFy3LEV6NQf6psCy6OjG/RAoGAOvoryQvdSS6QlBV5qxO29ROXJF71xXO4Fko5EfDucjkwCEJMHZ2oMXTBXc4+PKgmYHODM/afKM7fOri5e91uOiATQ5EJV0kBfWJxFblYNfJ9y/Lw13dL/N9szf93oAVCv+Xnb9e6Z7YqQvUyoP6sG4Wq0R0CTtaF3kRBMybzcakCgYBiEcT1Cl4hJBzPZKBWAMc3zzHTYwoSJb4+DEKG3n/sTvmvVXIs2C6LKT2Rmmk8t6240HrynYGB4SO6+xYP8IPi44k170e2sDfX35CBQvMbHE5dkHAg6C1+Gt+t23Feppe8D3IepTE/arCHv3+btH40rba5AvaMJ2mW+6Fk/CW4kQ==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAu/vajmE4VqUDgwD7HhCpNLGPg/E7uMD1lA93uQE2CqStmGU1xrsHtsyIRiyg60PArYcOyZiytcXF4fDKRvpCSZ8qhf/XiHE8WP6m6S+9v/sr46sinkjdt2J0tgfQJp6Ys5ZjF5QEqQEIJfjZIuYpzTf+LVGMl6ZKyn2yLBVgstkZDX/KQD96a+kp4l3r3khiwMEYIYgpp2hbjmz9GkBG1p7mUEovl6Ar0Y5j6dyG2RUMk+jRzKQgQzkavQvfUFbNl3HWWz/IoBJznmi9k+Lqv9FPG728HxHUjbYfZ+y0MtU0kaeMtpNI7wPJkUphKGLxLae8AwI+6+N48jEfz09aFQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://6z2ypg.natappfree.cc/1.html";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://6z2ypg.natappfree.cc/2.html";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

