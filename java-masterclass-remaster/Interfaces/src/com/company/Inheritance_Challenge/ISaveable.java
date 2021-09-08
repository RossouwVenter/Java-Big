package com.company.Inheritance_Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
