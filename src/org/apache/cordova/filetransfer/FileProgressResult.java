
package org.apache.cordova.filetransfer;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Encapsulates in-progress status of uploading or downloading a file to a remote server.
 */
public class FileProgressResult {

    private boolean lengthComputable = false; // declares whether total is known
    private long loaded = 0;                  // bytes sent so far
    private long total = 0;                   // bytes total, if known

    public boolean getLengthComputable() {
        return lengthComputable;
    }

    public void setLengthComputable(boolean computable) {
        this.lengthComputable = computable;
    }

    public long getLoaded() {
        return loaded;
    }

    public void setLoaded(long bytes) {
        this.loaded = bytes;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long bytes) {
        this.total = bytes;
    }

    public JSONObject toJSONObject() throws JSONException {
        return new JSONObject(
                "{loaded:" + loaded +
                ",total:" + total +
                ",lengthComputable:" + (lengthComputable ? "true" : "false") + "}");
    }
}
