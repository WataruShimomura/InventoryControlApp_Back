package inventory.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import inventory.data.entity.Stock;;

@Mapper
public interface testMapper {
	@Select("SELECT id, name,stockNum FROM Stock")
	public List<Stock> stocklist();
}
