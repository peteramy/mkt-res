package cn.com.tontron.res.common.base.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AutoModel implements Dto {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;

    public AutoModel() {
    }

    public AutoModel(Long id) {
        this.setId(id);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other != null && other.getClass().isAssignableFrom(this.getClass())) {
            Long otherId = ((AutoModel) other).getId();
            return this.id == null ? false : (otherId == null ? false : this.id.equals(otherId));
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.id == null ? super.hashCode() : this.id.hashCode();
    }
}

