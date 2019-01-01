package org.jian.boot.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 当前的表单的验证
 */
public class FormValid {
    private List<FieldValid> valids;
    private boolean hasError;
    private String msg;


    public FormValid() {
        this.valids = new ArrayList<>();
    }

    public List<FieldValid> getValids() {
        return valids;
    }

    public void setValids(List<FieldValid> valids) {
        this.valids = valids;
    }

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
