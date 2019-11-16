package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "在庫数増減レスポンス")
@Data
public class StockChangeRes {

	@ApiModelProperty(value = "id", example = "1")
	private int id;

	@ApiModelProperty(value = "計算後の在庫数量", example = "1")
	private int afterStockNum;

}
