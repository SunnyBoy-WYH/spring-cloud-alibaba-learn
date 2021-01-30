package com.sca.account.Service;
/**
 * @author 阳光大男孩！！！
 */
public interface AccountService {

    /**
     * 减钱
     * @param userId
     * @param money
     */
    void decreaseMoney(String userId, Integer money);
}
