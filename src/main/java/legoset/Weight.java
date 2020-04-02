package legoset;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Weight {

    private String unit;
    private double value;

    public Weight() {}

    public Weight(String unit, double value) {
        this.unit=unit;
        this.value=value;
    }

}
