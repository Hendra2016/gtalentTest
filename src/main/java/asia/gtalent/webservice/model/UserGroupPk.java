package asia.gtalent.webservice.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserGroupPk implements Serializable {
    private String groupId;
    private String userId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
