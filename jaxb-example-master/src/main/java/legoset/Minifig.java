package legoset;
import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"counts", "name"})
@Data
public class Minifig {
    public int counts;
    public String name;

    public Minifig(int counts, String name) {
        this.counts = counts;
        this.name = name;
    }
}
