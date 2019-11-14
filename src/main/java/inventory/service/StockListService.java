package inventory.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.data.StockRes;
import inventory.data.entity.Stock;
import inventory.mapper.StockMapper;

@Service
public class StockListService {

	@Autowired
	private StockMapper StockMapper;


	public List<StockRes> getStockList() {
		List<Stock> result = StockMapper.stocklist();
		List<StockRes> response = result.stream().map(t -> {
			StockRes res = new StockRes();
			res.setId(t.getId());
			res.setName(t.getName());
			res.setStockNum(t.getStockNum());
			return res;
		}).collect(Collectors.toList());
		return response;
	}

}
