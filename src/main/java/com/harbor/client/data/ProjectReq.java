package com.harbor.client.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author lr
 * @date 2021/2/5
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProjectReq {

    @JsonProperty("count_limit")
    private Integer countLimit = -1;

    @JsonProperty("project_name")
    private String projectName;

    @JsonProperty("storage_limit")
    private Integer storageLimit = -1;

    @JsonProperty("metadata")
    private ProjectMetadata metadata;

}
