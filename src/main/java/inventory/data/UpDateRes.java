package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "情報更新")
@Data
public class UpDateRes {

	@ApiModelProperty(value = "名前", example = "リンゴ")
	private String name;
	@ApiModelProperty(value = "在庫数", example = "10")
	private Integer stockNum;

}
