package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class UpDateService {

	@Autowired
	private StockMapper stockMapper;

	public void upDateService(int id,String name) {
		stockMapper.updateReqMapper(id,name);
	}

}
