
package org.apache.cordova.filetransfer;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Encapsulates the result and/or status of uploading a file to a remote server.
 */
public class FileUploadResult {

    private long bytesSent = 0;         // bytes sent
    private int responseCode = -1;      // HTTP response code
    private String response = null;     // HTTP response
    private String objectId = null;     // FileTransfer object id

    public long getBytesSent() {
        return bytesSent;
    }

    public void setBytesSent(long bytes) {
        this.bytesSent = bytes;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public JSONObject toJSONObject() throws JSONException {
        return new JSONObject(
                "{bytesSent:" + bytesSent +
                ",responseCode:" + responseCode +
                ",response:" + JSONObject.quote(response) +
                ",objectId:" + JSONObject.quote(objectId) + "}");
    }
}
