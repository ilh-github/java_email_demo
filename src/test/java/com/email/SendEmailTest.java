package com.email;

import com.email.service.IMailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmailApplication.class)
public class SendEmailTest {

    @Autowired
    private IMailService mailService;
    @Test
    public void sendEmail(){

        String content = "邮箱内容！";
        mailService.sendHtmlMail("1978805993@qq.com","主题：你好html邮件",content);
    }



}
