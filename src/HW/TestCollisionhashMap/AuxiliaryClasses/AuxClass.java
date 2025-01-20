package HW.TestCollisionhashMap.AuxiliaryClasses;

import java.util.Objects;

public class AuxClass {
     final int i;
    public AuxClass(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(i);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AuxClass auxClass = (AuxClass) o;
        return i == auxClass.i;
    }
/*@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AuxClass auxClass = (AuxClass) o;
    return i == auxClass.i;
}*/




    @Override
    public String toString() {
        return "AuxClass{" +
                "i=" + i +
                '}';
    }
}
