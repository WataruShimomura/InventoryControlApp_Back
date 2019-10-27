package inventory.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "品物情報")
@Data
public class GootsParamReq {

	@ApiModelProperty(value = "id", example = "1")
	private String id;

}
