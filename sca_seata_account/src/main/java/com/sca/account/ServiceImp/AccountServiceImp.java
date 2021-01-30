package com.sca.account.ServiceImp;

import com.sca.account.Dao.AccountTblDao;
import com.sca.account.Service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImp implements AccountService {
    private final AccountTblDao accountTblDao;
    @Override
    public void decreaseMoney(String userId, Integer money) {
        int a = 1/0;
        accountTblDao.decrease(userId,money);
    }
}
