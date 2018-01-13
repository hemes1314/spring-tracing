package org.wubin.sample.spring;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wubin
 * @date 2018/01/08
 **/
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertyValues() {

    }

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValueList;
    }
}
