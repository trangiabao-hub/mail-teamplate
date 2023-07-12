package mail.controller;

import mail.dto.EmailDetail;
import mail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    EmailService emailService;

    @GetMapping("test")
    public void sendMail(){
        EmailDetail emailDetail = new EmailDetail();
        emailDetail.setRecipient("giabaotran912@gmail.com");
        emailDetail.setSubject("test123");
        emailDetail.setMsgBody("aaa");
        emailService.sendMailTemplate(emailDetail);
    }
}
