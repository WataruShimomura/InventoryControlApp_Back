package inventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventory.mapper.StockMapper;

@Service
public class EntryReqService {

	@Autowired
	private StockMapper StockMapper;

	public void entryReq(String name,int stockNum) {
		//ログイン機能実装時に更新時間を追加
//		LocalDateTime date = LocalDateTime.now();
		StockMapper.entryReqMapper(name,stockNum);
	}

}
