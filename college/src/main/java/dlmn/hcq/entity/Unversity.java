package dlmn.hcq.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@TableName("university")
@ApiModel(value="university", description="")
public class Unversity implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "lineid", type = IdType.AUTO)
    private Integer lineid;

    @ApiModelProperty(value = "学校代码")
    private String code;

    @ApiModelProperty(value = "学校名字")
    private String schoolname;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "省份")
    private String city;

    @ApiModelProperty(value = "直属部门")
    private String department;

    @ApiModelProperty(value = "办学层次")
    private String level;

    @ApiModelProperty(value = "类型")
    private String type;

    @ApiModelProperty(value = "学校连接")
    private String link;


}
