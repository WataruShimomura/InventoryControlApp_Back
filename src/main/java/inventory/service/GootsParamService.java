package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.GootsParamRes;
import inventory.mapper.StockMapper;

@Service
public class GootsParamService {

	@Autowired
	private StockMapper StockMapper;

	//更新時間実装時に使用予定
	public GootsParamRes gootsParamReq(int id) {
		GootsParamRes result = StockMapper.gootsParamReqMapper(id);
		return result;
	}

}
