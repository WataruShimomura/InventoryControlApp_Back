package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class StockChangeService {

	@Autowired
	private StockMapper StockMapper;

	public void  stockChange(int id,int stockNum) {
		StockMapper.stockChangeMapper(id,stockNum);
	}
}
