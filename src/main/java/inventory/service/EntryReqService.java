package inventory.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class EntryReqService {

	@Autowired
	private StockMapper StockMapper;

	public void entryReq(String name,int stockNum) {
		LocalDateTime date = LocalDateTime.now();
		StockMapper.entryReqMapper(name,stockNum,date);
	}

}
