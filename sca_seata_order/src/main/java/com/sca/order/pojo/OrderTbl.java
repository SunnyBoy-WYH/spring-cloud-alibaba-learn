package com.sca.order.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * order_tbl
 * @author
 */
@Data
public class OrderTbl implements Serializable {
    private Integer id;

    private String userId;

    private String commodityCode;

    private Integer count;

    private Integer money;

    private static final long serialVersionUID = 1L;
}
