package com.sca.account.Controller;

import com.sca.account.Service.AccountService;
import com.sca.account.pojo.RequestResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 阳光大男孩！！！
 */
@RestController
@RequestMapping("account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;
    @RequestMapping("decreaseMoney")
    public RequestResult decreaseMoney(@RequestParam("userId") String userId,@RequestParam("money") Integer money)
    {
        System.out.println(userId+":"+money);
        accountService.decreaseMoney(userId,money);
        return RequestResult.ok();
    }
}
