package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import inventory.data.EntryReq;
import inventory.data.entity.Stock;

@Mapper
public interface StockMapper {
	@Select("SELECT id, name,stockNum FROM Stock")
	public List<Stock> stocklist();

	@Insert("insert into player (name, StockNum) values (#{name}, #{StockNum})")
	public EntryReq entryReq();
}
