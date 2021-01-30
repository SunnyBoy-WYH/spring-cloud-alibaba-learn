package com.sca.account.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * account_tbl
 * @author
 */
@Data
public class AccountTbl implements Serializable {
    private Integer id;

    private String userId;

    private Integer money;

    private static final long serialVersionUID = 1L;
}
