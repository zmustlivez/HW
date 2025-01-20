package HW.TestCollisionhashMap.AuxiliaryClasses;

import java.util.Objects;

public class AuxClass2 extends AuxClass {
    public AuxClass2(int i) {
        super(i);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(1);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AuxClass auxClass = (AuxClass) o;
        return super.i == auxClass.i;
    }
}
