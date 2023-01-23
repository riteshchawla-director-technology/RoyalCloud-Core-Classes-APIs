package royal.cloud.core.apis.codebases.responses;

import royal.cloud.core.apis.codebases.RoyalCloudCommonHelper;

import java.io.Serializable;
import java.util.*;

public class RoyalCloudRestResponseDTO<T, ID> extends RoyalCloudBasicCommonDTO<T, ID> implements Serializable {

    private T entityTypeObject;

    private List<T> entityTypesList;

    public Map<ID, List<T>> entityTypeListMap;

    public T[] entityTypeArrays;

    public RoyalCloudRestResponseDTO(Class clazz) {
        try {
            entityTypeObject = (T) clazz.newInstance();
            entityTypesList = new LinkedList<>();
            entityTypesList.add((T) clazz.newInstance());
            entityTypeListMap = new HashMap<>();
            List<T> tempList = new ArrayList<>();
            tempList.add((T) clazz.newInstance());
            entityTypeArrays = (T[])tempList.toArray();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public T getEntityTypeObject() {
        return entityTypeObject;
    }

    public void setEntityTypeObject(T entityTypeObject) {
        this.entityTypeObject = entityTypeObject;
    }

    public List<T> getEntityTypesList() {
        return entityTypesList;
    }

    public void setEntityTypesList(List<T> entityTypesList) {
        this.entityTypesList = entityTypesList;
    }

    public Map<ID, List<T>> getEntityTypeListMap() {
        return entityTypeListMap;
    }

    public void setEntityTypeListMap(Map<ID, List<T>> entityTypeListMap) {
        this.entityTypeListMap = entityTypeListMap;
    }

    public T[] getEntityTypeArrays() {
        return entityTypeArrays;
    }

    public void setEntityTypeArrays(T[] entityTypeArrays) {
        this.entityTypeArrays = entityTypeArrays;
    }

    @Override
    public String toString() {
        return RoyalCloudCommonHelper.getInstance().getJsonStringFromObject(this);
    }
}
