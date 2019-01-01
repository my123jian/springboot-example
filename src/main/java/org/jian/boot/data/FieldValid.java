package org.jian.boot.data;

import java.util.ArrayList;
import java.util.List;

/**
 * 当前的字段的验证
 */
public class FieldValid {
    private List<String> fields;
    private String errors;

    public FieldValid(){
        this.fields=new ArrayList<>();
    }
    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public String getErrors() {
        return errors;
    }

    public void setErrors(String errors) {
        this.errors = errors;
    }
}
