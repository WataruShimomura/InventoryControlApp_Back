package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "在庫")
@Data
public class GootsParamRes {

	@ApiModelProperty(value = "id", example = "2")
	private int id;
	@ApiModelProperty(value = "名前", example = "リンゴ")
	private String name;
	@ApiModelProperty(value = "在庫数", example = "10")
	private Integer stockNum;

}
