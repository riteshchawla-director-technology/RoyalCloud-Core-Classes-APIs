package royal.cloud.core.apis.codebases.responses;

public class RoyalCloudGeneralRestResponseDTO<LoyalMirrorRestfulAPIResponse>
        extends RoyalCloudRestResponseDTO<LoyalMirrorRestfulAPIResponse, String> {

    private LoyalMirrorRestfulAPIResponse restfulAPIResponse;

    public RoyalCloudGeneralRestResponseDTO(Class clazz) {
        super(clazz);
        this.restfulAPIResponse = super.getEntityTypeObject();
    }

    public LoyalMirrorRestfulAPIResponse getLoyalMirrorRestfulAPIResponseInstance() {
        if(restfulAPIResponse == null) {
            restfulAPIResponse = getEntityTypeObject();
        }
        return restfulAPIResponse;
    }
}
