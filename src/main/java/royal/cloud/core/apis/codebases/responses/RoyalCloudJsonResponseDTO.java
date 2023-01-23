package royal.cloud.core.apis.codebases.responses;

import royal.cloud.core.apis.codebases.RoyalCloudCommonHelper;
import org.apache.commons.lang3.StringUtils;

public class RoyalCloudJsonResponseDTO {
    private String jsonKey;

    private RoyalCloudRestResponseDTO responseEntity;

    public RoyalCloudJsonResponseDTO(String jsonKey, Class clazz) {
        this.jsonKey = StringUtils.EMPTY;
        try {
            Object instanceObject = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
           throw new RuntimeException(e);
        }
        this.responseEntity = new RoyalCloudRestResponseDTO<RoyalCloudCommonResponseEntity, String>(clazz);
    }

    public String getJsonKey() {
        return jsonKey;
    }

    public void setJsonKey(String jsonKey) {
        this.jsonKey = jsonKey;
    }

    public RoyalCloudRestResponseDTO getResponseEntity() {
        return responseEntity;
    }

    public void setResponseEntity(RoyalCloudRestResponseDTO responseEntity) {
        this.responseEntity = responseEntity;
    }

    @Override
    public String toString() {
        return RoyalCloudCommonHelper.getInstance().getJsonStringFromObject(this);
    }
}
