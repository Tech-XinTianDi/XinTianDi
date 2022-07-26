package com.springboot.cloud.file.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author fengdan
 * @date 2021年07月01日 15:04
 */
@ApiModel
@Data
public class FileObject {

    private String fileName;

    private String bucketName;
}
