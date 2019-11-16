package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;

import inventory.data.GootsParamRes;
import inventory.mapper.StockMapper;

public class GootsParamService {

	@Autowired
	private StockMapper StockMapper;

	public GootsParamRes gootsParamReq(int id) {
		GootsParamRes result = StockMapper.gootsParamReqMapper(id);
		return result;
	}

}
