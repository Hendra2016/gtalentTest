package asia.gtalent.webservice.model;

import javax.persistence.*;

@Entity
@Table(name="user_group")
@IdClass(UserGroupPk.class)
public class UserGroup {
    private String groupId;
    private String userId;

    @Id
    @Column(name="group_id")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Id
    @Column(name="user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
