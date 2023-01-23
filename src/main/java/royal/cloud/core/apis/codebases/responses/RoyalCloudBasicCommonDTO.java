package royal.cloud.core.apis.codebases.responses;

import java.util.Date;

public class RoyalCloudBasicCommonDTO<T, ID> {

    protected String identity;
    protected Date creationDate;
    protected Date lastModifiedDate;

    public RoyalCloudBasicCommonDTO() {

    }

    public RoyalCloudBasicCommonDTO(String identity, Date creationDate, Date lastModifiedDate) {
        this.identity = identity;
        this.creationDate = creationDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
