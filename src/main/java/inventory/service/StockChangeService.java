package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;

import inventory.mapper.StockMapper;

public class StockChangeService {

	@Autowired
	private StockMapper StockMapper;

	public void  stockChange(int id,int stockNum) {
		StockMapper.stockChangeMapper(id,stockNum);
	}
}
