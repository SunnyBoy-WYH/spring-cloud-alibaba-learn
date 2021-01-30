package com.sca.storage.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * storage_tbl
 * @author
 */
@Data
public class StorageTbl implements Serializable {
    private Integer id;

    private String commodityCode;

    private Integer count;

    private static final long serialVersionUID = 1L;
}
