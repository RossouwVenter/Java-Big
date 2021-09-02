package com.company.Question15;

import java.util.ArrayList;
import java.util.List;

 interface CanSwim {
}

 class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

public class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for (Amphibian amphibian : tadpoles) {
            Object tadpole = amphibian;
        }
    }
}
