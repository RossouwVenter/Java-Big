package org.example.mypackage.com.example.game;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
