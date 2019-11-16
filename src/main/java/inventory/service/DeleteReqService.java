package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class DeleteReqService {

	@Autowired
	private StockMapper StockMapper;

	public void deleteReq(int id) {
		StockMapper.deleteReqMapper(id);
	}
}
