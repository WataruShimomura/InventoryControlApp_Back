package inventory.mapper;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import inventory.data.GootsParamRes;
import inventory.data.entity.Stock;

@Mapper
public interface StockMapper {
	@Select("SELECT id, name,stockNum FROM Stock")
	public List<Stock> stocklist();

	@Insert("insert into Stock (name, stockNum, upDateTime) values (#{name}, #{stockNum}, #{upDateTime})")
	public void entryReqMapper(@Param("name") String name,@Param("stockNum")int stockNum,@Param("upDateTime")LocalDateTime upDateTime);

	@Delete("delete from Stock where id = #{id}")
	public void deleteReqMapper(@Param("id")int id);

	@Select("select * from Stock where id = #{id}")
	public GootsParamRes gootsParamReqMapper(@Param("id")int id);

	@Update("update Stock set name = #{name} where id = #{id}")
	public void updateReqMapper(@Param("id")int id,@Param("name")String name);

	@Update("update Stock set stockNum + #{stockNum} where id = #{id}")
	public void stockChangeMapper(@Param("id")int id,@Param("stockNum")int stockNum);
}
