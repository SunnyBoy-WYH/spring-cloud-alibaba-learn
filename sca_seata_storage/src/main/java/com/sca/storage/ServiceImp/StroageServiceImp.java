package com.sca.storage.ServiceImp;

import com.sca.storage.Dao.StorageTblDao;
import com.sca.storage.Service.StorageService;
import com.sca.storage.pojo.StorageTbl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StroageServiceImp implements StorageService {
    private final StorageTblDao storageTblDao;
    @Override
    public void deduct(String commodityCode, int count) {

        storageTblDao.updateByCommodityCode(commodityCode,count);

    }
}
