
package com.mycompany;

import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class DataMB {
    
    private final List<MyObject> list;

    public DataMB() {
        this.list = Arrays.asList(
                new MyObject(1, "Mark", "Otto", "@mdo"),
                new MyObject(2, "Mark", "Otto", "@mdo"),
                new MyObject(3, "Mark", "Otto", "@mdo"),
                new MyObject(4, "Mark", "Otto", "@mdo"),
                new MyObject(5, "Mark", "Otto", "@mdo"),
                new MyObject(6, "Mark", "Otto", "@mdo"),
                new MyObject(7, "Mark", "Otto", "@mdo"),
                new MyObject(8, "Mark", "Otto", "@mdo"),
                new MyObject(9, "Mark", "Otto", "@mdo"),
                new MyObject(10, "Mark", "Otto", "@mdo")
        );
    }

    public List<MyObject> getList() {
        return list;
    }
    
}
