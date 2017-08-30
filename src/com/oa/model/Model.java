package com.oa.model;

import java.util.Date;
import java.util.List;

public class Model {
    private Integer modelId;

    private String modelName;

    private Integer createUserId;

    private Date createtime;
    private List<ModelColumnName> list;
    private List<ModelColumn> mc;

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public List<ModelColumnName> getList() {
        return list;
    }

    public void setList(List<ModelColumnName> list) {
        this.list = list;
    }

    public List<ModelColumn> getMc() {
        return mc;
    }

    public void setMc(List<ModelColumn> mc) {
        this.mc = mc;
    }
}