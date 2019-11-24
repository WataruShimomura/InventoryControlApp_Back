package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class UpdateStockService {
	@Autowired
	private StockMapper StockMapper;

	public void  updateStock(int id,int stockNum) {
		StockMapper.upDateStockMapper(id,stockNum);
	}

}
